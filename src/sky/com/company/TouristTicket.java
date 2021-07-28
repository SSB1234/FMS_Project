package sky.com.company;

public class TouristTicket {
    String hotelAddress;
    String[] selectedTouristLocation;

    public TouristTicket(String hotelAddress,String[] selectedTouristLocation){
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];
    }
    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocations() {
        return selectedTouristLocation;
    }
    public void removeTouristLocations(String location){
        for(int index=0;index<selectedTouristLocation.length;index++){
            if(location.equals(selectedTouristLocation[index])){
                selectedTouristLocation[index]=null;
            }
        }

    }
    public void addTouristLocations(String location){
        for(int index=0;index<selectedTouristLocation.length;index++){
            if(selectedTouristLocation[index]==null){
                selectedTouristLocation[index]=location;
            }
        }
    }
}
