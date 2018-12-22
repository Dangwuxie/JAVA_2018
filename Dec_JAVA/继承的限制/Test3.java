//方法覆写不能出现private；
class Person{
    public void fun(){
        this.print();
    }
    private void print(){
        System.out.println("1、person类的print方法");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2、student类中的print方法");
    }
}
public class Test3{
    public static void main(String[] args){
        Student stu = new Student();
        stu.print();
    }
}