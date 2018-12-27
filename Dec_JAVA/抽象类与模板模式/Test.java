//方法内部类 （局部内部类）
class Outter{
    private int num;
    public void play(int sum){
        class Inner{
            public void fun(){
                num++;
                System.out.println(num);
                System.out.println(sum);
            }
        }
        new Inner().fun();
    }
}
public class Test{
    public static void main(String[] args){
        Outter out = new Outter();
        out.play(30);
    }
}
