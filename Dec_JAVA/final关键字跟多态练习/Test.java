//final关键字：
//修饰类、方法、属性。
class Person{
        public final int age = 10;      
        public final void print(){
            System.out.println("父类中被覆写的方法");
        } 
}
public class Test extends Person{
    public static void main(String[] args){
        Test test = new Test();
        //--------------------------------------------
        //Test.java:9: 错误: 无法为最终变量age分配值
        // test.age = 20;
        //     ^
        //  1 个错误
        //test.age = 20;
        //-----------------------------------
        System.out.println(test.age);
        //--------------------------------------
        // Test.java:20: 错误: 非法的表达式开始
        public void print(){
            System.out.println("子类准备覆写的方法");
        }
        //--------------------------------------
        // public final int age = 9;
        // System.out.println(age);
    }
}