class B{
    public String name;
    public int age;
    public void fun(String name){
        this.name = name;
        System.out.println(name);
    }
    public void fun2(int age){
        this.age = age;
        System.out.println(age);
    }
    static{
        System.out.println("父类静态块");
    }
    {
        System.out.println("父类构造块");
    }
}
class C extends B{
    public String country;
    public void fun3(String country){
        this.country = country;
        System.out.println(country);
    }
    static{
        System.out.println("子类的静态块");
    }
    {
        System.out.println("子类的构造块");
    }
}
class D extends C{
    public String province;
    public void fun4(String province){
        this.province = province;
        System.out.println(province);
    }
}
public class A{
    public static void main(String[] args){
    // C c = new C();
    // c.fun("张三");
    // c.fun2(22);
    // c.fun3("中国");
    //// 父类静态块
// 父类构造块
// 张三
// 22
// 中国
    //----------------------------------------
    D d = new D();
    d.fun("李四");
    d.fun2(33);
    d.fun3("中华");
    d.fun4("陕西");
// 父类静态块
// 子类的静态块
// 父类构造块
// 子类的构造块
// 李四
// 33
// 中华
// 陕西
    }
}
