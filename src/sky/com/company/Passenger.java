package sky.com.company;

public class Passenger {
    int id;
    Address address;
    Contact contact;
    public Passenger(Address address, Contact contact){
        this.address = address;
        this.contact = contact;
    }
    public Contact getContact(){
        return contact;
    }
    public Address getaddress(){
        return address;
    }
}
