class Car3 {
    // メンバ変数
    private int no;
    private int speed;

    // コンストラクタ設定（引数なし）    
    public Car3(){
        no = 0;
    }
    // コンストラクタ設定（引数あり）
    public Car3(int n){
        no = n;
    }
    
    // 通常メソッド定義
    public void run(int s){
        speed = s;
    }
    public void brake(){
        speed = 0;
    }
    public void brake(int s){
        speed = speed - s;
    }
    public void display(){
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
}
