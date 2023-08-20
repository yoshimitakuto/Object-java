class Student5 {
    private String name;
    private int score;

    public Student5(String n){
        name = n;
    }

    public void setScore(int s){
        if(0 <= s && s <= 100){
            score = s;
        } else{
            System.out.println(name + "さんの点数は範囲外の点数です");
            score = 0;
        }
    }

    public void display(){
        System.out.println(name + "さんの点数は" + score + "です");
    }
}
