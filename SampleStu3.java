class SampleStu3 {
    public static void main(String[] args){
        Student3 stu1 = new Student3("菅原");
        Student3 stu2 = new Student3("村山", 70, 60);
        // コンストラクタを自分で作った場合は引数なしのデフォルトコンストラクタは自動生成されないため以下の記述をするとコンパイルエラーになる
        // Student3 stu3 = new Student3();

        stu1.setScore(80, 90);
        stu1.display();

        stu2.display();
    }
}
