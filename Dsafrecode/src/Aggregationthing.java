class Address{
    String street;
    String city;
    String postalCode;
    Address(String street,String city,String postalCode){
        this.street=street;
        this.city=city;
        this.postalCode=postalCode;
    }
    void displayAddress(){
        System.out.println("Street: "+ street+"city: "+city+"postalCode"+postalCode);
    }
    
}

public class Aggregationthing {
    public static void main(String[] args) {

    }
}
