public class Car{
    String name;
    int price;

    public Car(String c, int p) {
        this.name = c;
        this.price =p;
    }
    public static void main(String []args){
         Car ca = new Car("audi",3400000); 
         System.out.print(ca.name+" " +ca.price);
    }
    
}