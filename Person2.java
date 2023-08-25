public class Person2 {
    private String name;

    public void setName(String n) {
        name = n;
    }
    // 戻り値がある場合は引数の値を「戻り値の型」に合わせる
    public String getName() {
        return name;
    }
    public void display() {
        System.out.println("名前：" + name);
    }

}
