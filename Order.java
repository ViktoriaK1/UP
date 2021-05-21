public class Order extends Product{

    protected int ID_Order;
    
    protected String name;
    
    protected int Product_Quantity;
    protected String Date_Order;
    protected int Final_Price;


    public void set_ID_Order (int ID_Order){

        this.ID_Order = ID_Order;

    }
    public void set_name (String name){

        this.name = name;

    }

    public void set_Product_Quantity (int Product_Quantity){

        this.Product_Quantity = Product_Quantity;

    }

    public void set_Date_Order (String Date_Order){
    
        this.Date_Order = Date_Order;

    }

    public void set_Final_Price (int Final_Price){

        this.Final_Price = Price*Product_Quantity;

    }
    public int get_ID_Order() {

        return ID_Order;

    }

    public int get_Product_Quantity() {

        return Product_Quantity;

    }

    public String Date_Order() {

        return Date_Order;

    }
    public int get_Final_Price() {

        return Final_Price;

    }


    public Order (int ID_Order,String name, String Product_Name, int Price, int Product_Quantity, String Date_Order, boolean Delivery ){
    
        this.ID_Order = ID_Order;
        
        this.name=name;
        
        super.Product_Name = Product_Name;
        
        super.Price=Price;
        
        this.Product_Quantity = Product_Quantity;
        
        this.Date_Order = Date_Order;
        
        this.Final_Price = Price*Product_Quantity;
        super.Delivery = Delivery;

    }

    void outputting () {

        System.out.println("ID заказа - " + ID_Order);
        
        System.out.println("ФИО заказчика - " + name);

        System.out.println("Цена за 1 шт - " + super.Price);
    
        System.out.println("Название товара - " + super.Product_Name);

        System.out.println("Количество товаров - " + Product_Quantity);

        System.out.println("Дата заказа - " + Date_Order);

        System.out.println("Итоговая цена - " + Final_Price);
        System.out.println("Наличие Доставки - " + Delivery);

    }

}