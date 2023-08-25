public class Person3 {
    private String name;

    //3
    public Person3(String name) {
        // 同じクラスのメンバ変数やメソッドを呼び出す（this.）
        this.name = name;
    }

    //4
    public void display() {
        System.out.println("名前：" + name);
    }
}
