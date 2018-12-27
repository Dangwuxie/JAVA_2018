abstract class Person{
    public Person(){
        System.out.println("1、抽象类的构造方法");
    }
    //抽象方法
    public abstract void print();
}
class Student extends Person{
    public Student(){
        System.out.println("2、子类的构造方法");
    }
    public void print(){
        System.out.println("Hello World!");
    }
}
public class Test3{
    public static void main(String[] args){
        new Student();
    }
}
