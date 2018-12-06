//this调用本类方法
//1、调用普通方法;
class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.print();
    }
    public String getPersonInfo(){
        return "姓名："+name+"年龄："+age;
    }
    public void print(){
        System.out.println("**********************");
    }
}
public class Test2{
    public static void main(String[] args){
        Person per = new Person("张三",23);
        System.out.println(per.getPersonInfo());
    }
}