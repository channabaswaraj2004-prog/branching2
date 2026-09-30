public class Car{
    String name;
    int price;

    public Car(String c, int p) {
        this.name = c;
        this.price =p;
    }
    public void drive(){
        System.out.println("the car is "+this.name+" the price is " +this.price);    
    }
    public static void main(String []args){
         Car ca = new Car("audi",3400000); 
         System.out.print(ca.name+" " +ca.price);
         ca.drive();
    }
    
}