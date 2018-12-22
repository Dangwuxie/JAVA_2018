//2.编写一个程序，展示无论你创建了某个特定类的多少个对象，
//这个类的某个特定的static成员变量只有一个属性。 
class Person{
    private String name;
    private int age;
    private static char sex;
    public static void setSex(char se){
        sex = se;
    }
    public char getSex(){
        return sex;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void print(){
        System.out.println("姓名："+name+"年龄："+age+"性别："+sex);
    }
}
public class Test2{
    public static void main(String[] args){
        Person per = new Person();
        per.setAge(16);
        per.setName("张三");
        per.setSex('男');
        per.print();
         Person per2 = new Person();
        per2.setAge(22);
        per2.setName("李四");
       // per2.setSex('男');
        per2.print();
        Person per3 = new Person();
        per3.setAge(24);
        per3.setName("王五");
        per3.setSex('女');
        per3.print();
    }
}