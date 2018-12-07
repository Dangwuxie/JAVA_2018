class Person {
    private static String country;
    //使用static定义方法只有一个目的：某些方法不希望收到对象的控制，即可以在没有
    //实例化对象的时候执行；
    private String name;
    private int age;
    private static int salary;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.salary = age;//注意：所有的非static方法允许访问static属性或者方法；
    }
    public static void setCountry(String c){
        country = c;
       // salary = s;//注意：static方法不能调用非static属性以及方法；
    }
    public void getCountry(){
        System.out.println("姓名："+this.name+"年龄："+age+"国籍："+country+"薪水"+salary);
    }
}
public class Test{
    public static void main(String[] args){
        Person.setCountry("中国");
        Person person = new Person("张三",24);
        person.getCountry();
    }
}
