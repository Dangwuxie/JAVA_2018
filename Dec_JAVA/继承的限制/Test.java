//显式继承与隐式继承
//父类中的属性确实被子类所继承了，但是子类能够使用的是所有非private操作
//而所有的private操作都无法被直接使用，所以称为隐式继承；
class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Student extends Person {
    public void fun(){
        System.out.println(getName());
    }
}
public class Test{
    public static void main(String[] args){
        Student stu = new Student();
        stu.setName("张三");
        System.out.println(stu.getName());
        stu.fun();
    }
}