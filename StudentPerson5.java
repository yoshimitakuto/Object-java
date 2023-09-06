public class StudentPerson5 extends Person5 {
    // メンバ変数
    private int stuNo;

    // コンストラクタ
    public StudentPerson5(String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    };
    // メソッド（オーバーライド）
    public void display() {
        super.display();
        System.out.println("学籍番号：" + stuNo);
    };
    // メソッド（独自）
    public void chgStuNo(int stuNo) {
        this.stuNo = stuNo;
    };
}
