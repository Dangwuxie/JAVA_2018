//例子：向上转型
class Person{
    public void print(){
        System.out.println("父类方法");
    }
}
class Student extends Person{
    public void print(){
        System.out.print("子类方法");
    }
}
public class Test2 {
    public static void main(String[] args){
        Person per = new Student();
        per.print();
    }
}
//------------------------------------------------------------------------
// PS D:\Github\JavaSE_2018\Dec_JAVA\final关键字跟多态练习> java Test2
// 子类方法
//注意：不论是否发生了向上转型，核心本质在于：你使用的是哪一个子类（new在哪里），调用的方法是否被子类所覆写了。