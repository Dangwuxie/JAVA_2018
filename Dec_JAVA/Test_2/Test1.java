//1.创建一个Test类，包含有一个public权限的int型成员变量
//与一个char类型的成员变量，观察在main方法中的初始值。 
class Person{
    public int per;
    public char per2;
}
public class Test1{
    public static void main(String[] args){
        Person per3 = new Person();
        System.out.println(per3.per);
        System.out.println(per3.per2);
    }
}