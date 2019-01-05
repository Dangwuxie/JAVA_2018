abstract class Person{
    public abstract void test1();
    abstract class Inner{
        public abstract void test2();
}
class Student extends Person{
    public void test1(){
        
    }
    class InnerReal extends Inner{
        public void test2(){

        }
    }
}
public class Test5{
    public static void main(String[] args){
        new Student();//直接覆写Person中的抽象方法，内部类不覆写；
    }
}