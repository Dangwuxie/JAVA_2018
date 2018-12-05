//其他类
class Person{
    //描述人类的
    public String name;
    public int age;
    //方法调用了类中的属性
    public void fun(){
        System.out.println(name+"在"+age+"打豆豆");
    }
}
//主类,有且只有一个
public class Test3{
    public static void main(String[] args){
        //根据Person类产生了一个Person对象;
        Person per = new Person();
        per.name = "马云 阿爸";
        per.age = 50;
        //per.fun();
        //引用传递
        Person per1 = per;
        per1.name = "鹏哥";
        per1.fun();
        //鹏哥在50打豆豆;
        per = new Person();
        per.fun();

    }
}