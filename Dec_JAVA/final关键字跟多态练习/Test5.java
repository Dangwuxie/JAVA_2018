//定义一个方法，这个方法可以接收Person类的所有子类实例，并调用Person类的方法。
class Person{
    public void print(){
        System.out.print("人类");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("学生");
    }
}
class Worker extends Student{
    public void print(){
        System.out.println("工人");
    }
}
public class Test5{
    public static void main(String[] args){
        whoYouAre(new Student());
        whoYouAre(new Worker());
    }
    public static void whoYouAre(Person per){
        per.print();
    }
}