class Student3 {
    // メンバ変数（属性）
    String name;
    int engScore;
    int mathScore;

    // メソッド（操作）
    // コンストラクタの設定方法（クラス名に合わせる）
    Student3 (String n){
        name = n;
    }
    Student3 (String n, int e, int m){
        name = n;
        engScore = e;
        mathScore = m;
    }

    // 通常のメソッド定義
    void setScore(int e, int m){
        engScore = e;
        mathScore = m;
    }
    void display(){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
    }
}
