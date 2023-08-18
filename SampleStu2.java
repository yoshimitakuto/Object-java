class SampleStu2 {
    public static void main(String[] args){
        // オブジェクト生成（2名分）
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();

        stu1.setData("菅原");
        stu1.setScore(90, 80);
        stu1.display();

        stu2.setData("杉山", 80, 90);
        stu2.display();

    }
}
