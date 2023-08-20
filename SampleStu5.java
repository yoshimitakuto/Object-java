class SampleStu5 {
    public static void main(String[] args){
        Student5 stu1 = new Student5("菅原");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("近藤");
        stu2.setScore(-50);
        // stu2.score = -50; 設計図クラスでscoreというメンバ変数にprivate指定をしているため使用できずエラーになる（直接メンバ変数にアクセスできてしまうと修正の幅が広がるため効率性に欠ける）
        stu2.display();
    }
}
