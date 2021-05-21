public class Main{

public static void main(String[] args) {
    
  
    //Product qw = new Product (455 ,"xx", true);
   // qw.outputting();


System.out.println("Клиент: ");

Client me = new Client (455, "Здоровцов А.Д.", "88005553535", "ул.Связистов,д.Онанистов");

me.outputting();


System.out.println("");

System.out.println("Заказ: ");

Order hp = new Order(234, "Рудаков Е.С.","Дилдо гей зморыныч", 888,77,"12.12.2222", true );

hp.outputting();

}

}