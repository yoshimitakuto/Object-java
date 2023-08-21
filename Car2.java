class Car2 {
    // メンバ変数
    int no;
    int speed;

    // コンストラクタ設定（引数なし）    
    Car2(){
        no = 0;
    }
    // コンストラクタ設定（引数あり）
    Car2(int n){
        no = n;
    }
    
    // 通常メソッド定義
    void run(int s){
        speed = s;
    }
    void brake(){
        speed = 0;
    }
    void brake(int s){
        speed = speed - s;
    }
    void display(){
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
}
