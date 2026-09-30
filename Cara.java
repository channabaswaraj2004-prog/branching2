public class Cara {
    String brand = "Toyota";
    int speed = 0;

    void accelerate() {
        speed += 10;
        System.out.println(brand + " speed: " + speed);
    }

    public static void main(String[] args) {
        Cara c = new Cara();
        c.accelerate();
    }
}