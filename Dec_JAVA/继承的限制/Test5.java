//使用super关键字调用父类属性
class Person{
    public String name = "爸爸";
}
class Son extends Person{
    public String name = "儿子";
    public void print(){

        System.out.println(super.name);//调用父类中的name属性；
        System.out.println(this.name);
    }
}
public class Test5{
    public static void main(String[] args){
        new Son().print();
    }
}