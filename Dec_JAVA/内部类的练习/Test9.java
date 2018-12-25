class Outer{
    private String name = "hello";
    public void fun(final int num){
        class Inner{
            public void fun(){
            System.out.println(num);
            System.out.println(name);
            }
        }
        new Inner().fun();
    }
    // public void test(){
    //     Inner in = new Inner();
    // }
}
public class Test9{
    public static void main(String[] args){
        Outer out = new Outer();
        out.fun(20);
        // out.fun();
    }
}