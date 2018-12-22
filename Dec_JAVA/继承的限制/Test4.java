//super关键字
//调用父类属性或者方法
//1、调用父类的方法；
class Person{
    public void print(){
        System.out.println("父类的方法");
    }
}
class Student extends Person{
    public void print(){  
       // super.print();
        System.out.println("子类的方法");
    }
}
public class Test4{
    public static void main(String[] args){
        Student stu = new Student();
        stu.print();
    }
}