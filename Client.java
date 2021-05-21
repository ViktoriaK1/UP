public class Client{

    protected int ID_Client;

    protected String name;

    protected String number;

    protected String address;

    public void set_ID_Client (int ID_Client){

        this.ID_Client = ID_Client;

    }

    public void set_name (String name){

        this.name = name;

    }

    public void set_number (String number){

        this.number = number;

    }

    public void set_address (String address){

        this.address = address;

    }

    public int get_ID_Client() {

        return ID_Client;

    }

    public String get_name() {

        return name;

    }

    public String get_number() {

        return number;

    }

    public String get_address() {

        return address;

    }
     public Client (int ID_Client,String name,String number, String address){
    
        this.ID_Client = ID_Client;
        
        this.name=name;

        this.number =number;
        
        this.address=address;
        
    }

    void outputting () {

        System.out.println("ID заказчика - " + ID_Client);
        
        System.out.println("ФИО заказчика - " + name);

        System.out.println("Номер телефона - " + number);
    
        System.out.println("Адрес - " + address);

    }
}