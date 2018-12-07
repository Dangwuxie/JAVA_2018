//构造块：定义在类中的代码块；
//非主类中，构造块先于构造方法执行；
//产生一个新的对象就调用一次构造块；
class Person{
    //定义在类中，不加任何修饰符
    {
        System.out.println("1、Person类中的构造块");
    }
    public Person(){
        System.out.println("2、Person类中的构造方法");
    }
}
public class Test2{
    
    public static void main(String[] args){
        new Person();
        new Person();
    }
    // {
    //     System.out.println("3、Person类中的构造块");`
    // }
}