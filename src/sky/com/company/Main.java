package sky.com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Flight airIndia = new  Flight("1234","Air India",500);
        Address address = new Address("Mp nagar","Bhopal","Madhya Pradesh");
        Contact contact = new Contact("Praveen","2345395834","example@email.com");
        Passenger Ankit = new Passenger(address,contact);
        Ticket ticket = new Ticket("2345566","Delhi","Mumbai",airIndia,"2:00 PM",
         "4:00 PM",Ankit,"35f",5678.00f);
        System.out.println(airIndia.getFlightNumber());
        System.out.println(airIndia.getAirline());
        System.out.println(airIndia.getCapacity());
        System.out.println(airIndia.getBookedSeats());
        System.out.println(address.street+" "+address.city+" "+address.state);
        System.out.println(contact.email+" "+contact.name+" "+contact.phone);
        System.out.println(Ankit.contact);
    }
}
