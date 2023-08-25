public class StudentPerson3 extends Person3 {
    private int stuNo;

    //1
    public StudentPerson3(String name) {
        // 同じクラスのコンストラクタを呼び出す（this()）
        this(name, 999);
    }
    //2
    public StudentPerson3(String name, int stuNo) {
        // スーパークラスのコンストラクタを呼び出す（super()）
        super(name);
        this.stuNo = stuNo;
    }

    //5
    public void display() {
        // スーパークラスのメンバ変数やメソッドを呼び出す（super.）
        super.display();
        System.out.println("学生番号：" + stuNo);
    }

}
