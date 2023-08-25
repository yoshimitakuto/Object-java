public class PerStuSample2 {
    public static void main(String[] args) {
        StudentPerson2 stu = new StudentPerson2();

        stu.setName("菅原");
        stu.setStuNo(1);
        stu.display(); //呼び出されるのはサブクラスのdisplayメソッドが呼び出される
    }
}
