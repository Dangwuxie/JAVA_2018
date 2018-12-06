//this调用本类属性
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        //如果方法参数名与对象属性名相同，在构造函数里面的属性初始化会优先调用方法的形参，而不是对象的属性；
    //    name = name;
    //    age = age;//输出姓名：null年龄：0
        //加上this关键字以后，表示调用类中同名属性
          this.name = name;//输出：姓名：张三年龄：100
          this.age = age;
    }
    public String getPersonInfo(){
       return "姓名："+name+"年龄："+age;
       // System.out.println("姓名："+name+"年龄："+age);
    }
}
public class Test{
    public static void main(String[] args){
        Person per = new Person("张三",100);
        System.out.println(per.getPersonInfo());
    }
}