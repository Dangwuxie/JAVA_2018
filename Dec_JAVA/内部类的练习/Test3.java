class Person{
    public void print(){
        System.out.println("父类中的方法");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("子类中的方法");
    }
}
public class Test3{
    public static void main(String[] args){
        //向上转型
        Person per = new Person();
        String str = "Hello ";
        // if(per instanceof Student){
        //     Student stu = (Student) per;
        // }else{
        //     System.out.println("无法强制类型转换");
        //     per = new Student();
        // }
        if(!(str instanceof Person)){
            System.out.println("无法强制转换");
        }
    }
}