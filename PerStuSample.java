public class PerStuSample {
    public static void main(String[] args){
        StudentPerson stu = new StudentPerson();

        // スーパークラスメソッドの呼び出し（継承を用いているため利用が可能になる）
        stu.setName("菅原");
        stu.display();

        // サブクラスのメソッド呼び出し
        stu.setStuNo(1);
        stu.displayStuNo();

    }
}
