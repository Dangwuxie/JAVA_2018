class Outer{
    private String words = "外部类的私有属性";
    class Inner{
        private String words1 = "内部类的私有属性";
        public void fun(){
            System.out.println(words);
        }
    }
}
public class Test7{
    public static void main(String[] args){
        Outer.Inner in = new Outer().new Inner();
        in.fun();
    }
}