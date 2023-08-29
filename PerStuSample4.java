public class PerStuSample4 {
    public static void main(String[] args) {
        final int BASE_NO = 1000;

        StudentPerson4 stu1 = new StudentPerson4("菅原", BASE_NO + 1);
        stu1.display();

        StudentPerson4 stu2 = new StudentPerson4("田中", BASE_NO + 2);
        stu2.display();

        BASE_NO = 2000;
    }
}
