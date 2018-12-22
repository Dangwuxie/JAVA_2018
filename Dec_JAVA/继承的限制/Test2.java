//覆写：子类定义了与父类方法名称、参数类型及个数完全相同的方法。
//但是被覆写后不能够拥有比父类更为严格的访问控制权限。
class Person{
    public void print(){
        System.out.println("父类的print方法");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("子类的print方法");
    }
}
public class Test2{
    public static void main(String[] args){
        Student stu = new Student();
        stu.print();
    }
}