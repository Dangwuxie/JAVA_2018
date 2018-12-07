//继承跟代码块的执行顺序
class A{
    public A(){
        System.out.println("1、父类的构造函数 ");
    }
    {
        System.out.println("2、父类的构造块");
    }
    static{
        System.out.println("3、父类的静态代码块块");
    }
}
class B extends A{
    public B(){
        System.out.println("4、子类的构造方法 ");
    }
    {
        System.out.println("5、子类的构造块");
    }
    static{
        System.out.println("6、子类的静态代码块");
    }
}
//7 8 9 3 6 s 2154 2154 e
public class Test2{
    static{
        System.out.println("7、主类中的静态代码块");
    }
    {
        System.out.println("8、主类中的构造块");
    }
    public Test2(){
        System.out.println("9、主类中的构造方法");
    }
    public static void main(String[] args){
        System.out.println("start-----------------");
        new B();
        new B();
        System.out.println("end-------------------");
    }
}