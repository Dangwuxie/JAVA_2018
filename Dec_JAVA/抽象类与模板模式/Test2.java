//抽象方法的定义
abstract class Person{
    //抽象方法
    public abstract void print();//抽象方法没有方法体
    //抽象类中的普通方法
    public static Person getInstance(){
        //局部内部类
        //封装具体实现子类
        class Student extends Person{
        public void print(){
                System.out.println("Hello World");
            }
        }
        return new Student();
    }
}

public class Test2{
    public static void main(String[] args){
        Person per = Person.getInstance();
        per.print();
    }
}