class Outer{
    private String words = "I am Outer";
    public void test(){
        //this表示当前对象；
        Inner in = new Inner(this);
        in.fun();
    }
    public String getWords(){
        return this.words;
    }
}
class Inner{
    private Outer out;
    public Inner(Outer out){
        this.out = out;
    }
    public void fun(){
            System.out.println(out.getWords());
        }
}
public class Test4{
    public static void main(String[] args){
        Outer out = new Outer();
        out.test();
    }
}