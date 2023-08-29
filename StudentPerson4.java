public final class StudentPerson4 extends Person4 {
    private int stuNo;

    public StudentPerson4(String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    }
    public void display() {
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}
