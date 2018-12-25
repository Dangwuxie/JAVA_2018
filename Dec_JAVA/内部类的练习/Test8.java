class Outer{
    static class Inner{
        public void fun(){
            System.out.println("内部类");
        }
    }
}
public class Test8{
    public static void main(String[] args){
        Outer.Inner in = new Outer.Inner();
        in.fun();
    }
}