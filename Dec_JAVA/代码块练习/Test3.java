//静态代码块
//使用static定义的代码块
//1、在非主类中
class Person{
    //定义在非主类中的构造块
    
    public Person(){
        System.out.println("2、非主类中的构造方法");
    }
    {
        System.out.println("1、非主类中的构造块 ");
    }
    //定义在非主类中的静态块,
    static {
        System.out.println("3、非主类的静态块");
    }
}
public class Test3{
    public static void main(String[] args){
        System.out.println("--开始--");
        new Person();
        new Person();//无论产生多少实例化对象，静态块都只产生一次；
        System.out.println("--END--");
    }
    // {
    //     System.out.println("5、定义在主类中的构造块");
    // }
    static{
        System.out.println("4、定义在主类中的静态块 ");
    }
}