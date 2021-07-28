package sky.com.company;

public class RegularTicket {
    String specialServices;
    public RegularTicket(String specialServices){
        this.specialServices = specialServices;
    }

    public String getSpecialServices(){
        return specialServices;
    }
    public void updateSpecialServices(String specialServices){
           this.specialServices = specialServices;
    }
}
