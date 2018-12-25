class Outer{
    private String name = "Outer的私有属性";
    class Inner{
        private String name1 = "Inner中的私有属性";
        public void fun(){
            System.out.println(name);
        }
    }
    //外部类通过内部类对象间接访问内部类属性
    public void test(){
        Inner in = new Inner();
        System.out.println(in.name1);
    }
}
public class Test6{
    public static void main(String[] args){
        Outer out = new Outer();
        out.test();
    }
}