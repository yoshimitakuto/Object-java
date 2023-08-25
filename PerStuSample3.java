public class PerStuSample3 {
    public static void main(String[] args) {
        // 1~5の順番で以下は処理されている
        StudentPerson3 stu = new StudentPerson3("菅原");
        
        // オーバーライドしているため、サブクラスのメソッドが呼び出される
        stu.display();
    }
}
