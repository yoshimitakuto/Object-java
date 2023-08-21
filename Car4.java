class Car4 {
    private int no;
    private static int count = 0;

    public Car4(){
        no = 0;
        count++;
        System.out.println("ナンバーなしを作りました");
    }

    public Car4(int n){
        no = n;
        count++;
        System.out.println("ナンバー" + no + "を作りました");
    }

    // メソッドに対して「staticメソッド」を呼び出すとインスタンス化しなくても自動で呼び出すことができるようになる
    public static void display(){
        System.out.println(count + "台作成済みです");
    }

}
