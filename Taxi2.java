public class Taxi2 extends Car5 {
    private int price;

    public Taxi2(int no) {
        super.setNo(no);
        this.price = 0;
    }
    public Taxi2(int no, int price) {
        super.setNo(no);
        this.price = price;
    }

    public void start() {
        this.price = 420;
    }
    public void run() {
        this.price = price + 80;
    }
    public void display() {
        super.display();
        System.out.println("料金は" + price + "円です");
    }
}
