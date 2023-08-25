public class StudentPerson2 extends Person2 {
    private int stuNo;

    public void setStuNo(int s) {
        stuNo = s;
    }
    // オーバーライド（スーパークラスのメソッドと同じ「戻り値の値・メソッド名・引数の値」を定義することで上書きできる）
    public void display() {
        System.out.println("名前" + getName()); //nameを指定できないのは、Person2クラスで「private」指定のためメソッドを経由して取得する必要がある。
        System.out.println("学籍番号" + stuNo);
    }
}
