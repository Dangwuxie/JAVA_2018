//定义；两个类
class Person {
    private String name;
    private int age;
    public Person(){
        System.out.println("父类的构造方法");
        //子类在实例化前先调用父类的构造方法产生实例后再调用子类的构造方法；
    }
    public void setName(String name){
        this.name = name;
    }
    public void steAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void fun(){
        System.out.println("姓名："+name+"年龄"+age);
    }
}
class Student extends Person{
    private String school;
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
}
//继承的主要作用就是对类的扩充以及代码的重用;
class Worker extends Person{
    private String factory;
    public Worker(){
        System.out.println("子类的构造方法");
    }
    public void setFactory(String factory){
        this.factory = factory;
    }
    public String getFactory(){
        return factory;
    }
}
public class Test{
    {
            System.out.println("主类中的构造块");
    }
    static {
            System.out.println("主类中的静态构造块");
    }
        
    public static void main(String[] args){
        
        
        // Person son = new Person();
        // son.setName("张三 ");
        // son.steAge(22);
        // son.fun();
        // System.out.println(son.getName());
        // System.out.println(son.getAge());
        // Student stu = new Student();
        // stu.setName(" 李四 ");
        // stu.steAge(44);
        // stu.setSchool(" 北大 ");
        // System.out.println(stu.getAge());
        // System.out.println(stu.getName());
        // System.out.println(stu.getSchool());
        Worker wor = new Worker();
        // wor.setFactory("腾讯;");
        // wor.setName("王五 ");
        // wor.steAge(33);
        // System.out.println(wor.getAge());
        // System.out.println(wor.getName());
        // System.out.println(wor.getFactory());
        // wor.fun();
       
    }
}