public class Taxi1 extends Car5 {
    private int price;

    public void start() {
        this.price = 420;
    }
    public void run() {
        this.price = price + 80;
    }
    public void display() {
        System.out.println("料金は" + price + "円です");
    }
}