//例子：观察向下转型
class Person{
    public void print(){
        System.out.println("父类方法");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("子类方法");
    }
    public void fun(){
        System.out.println("子类仅有");
    }
}
public class Test3{
    public static void main(String[] args){
        //错误，要想向下转型，必须先发生向上转型，然后子类对象强转为父类对象；
        // Test3.java:17: 错误: 不兼容的类型: Person无法转换为Student
        // Student stu = new Person();
        //Student stu = new Person();
        //-----------------------------------------------
        //先向上发生转型
        Person per = new Student();
        per.print();
        //per.fun();
        //Test3.java:25: 错误: 找不到符号
        //         per.fun();
        //            ^
        //   符号:   方法 fun()
        //   位置: 类型为Person的变量 per
        Student stu = (Student) per;
        stu.print();
        stu.fun();
    }
}