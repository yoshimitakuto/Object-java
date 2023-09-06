public class PerStuSample5 {
    public static void main(String[] args) {
        StudentPerson5 stu1 = new StudentPerson5("菅原", 1);
        Person5 psn = stu1; //子クラスの中にある親クラス
        psn.display(); //呼び出されるのはStudentPerson5.display()
    }
}
