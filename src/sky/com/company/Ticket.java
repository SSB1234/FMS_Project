package sky.com.company;

public class Ticket {
    String pnr;
    String from;
    String to;
    Flight flight;
    String departureDateTime;
    String arrivalDateTime;
    Passenger passenger;
    String seatNo;
    float price;
    boolean cancelled;

    public Ticket(String pnr,String from, String to ,Flight flight,String departureDateTime,String arrivalDateTime,
    Passenger passenger,String seatNo,float price){
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = false;
    }
    public String checkStatus(){
        if(flight.checkAvailability()==true ){ return "Confirmed";}
        else return "Cancelled";
    }
    public int getFlightDuration(){
        return 0;
    }
    public void cancel(){

    }
}
