abstract class Person{
    public Person(){//2、先调用父类的构造方法，
        this.print();//3、调用父类中的print()方法，但是父类中的抽象方法不能用，又去找子类的print()方法，
    }
    //抽象方法
    public abstract void print();//4
}
class Student extends Person{
    private int num = 100;
    public Student(int num){
        //隐藏代码
        //super();//先执行super()语句;
        //int num = 100;
        this.num = num;
    }
    public void print(){//5、所以又跑回子类，使用子类的print();
        System.out.println(this.num);//6
    }
}
public class Test4{
    public static void main(String[] args){
        new Student(30);//1.第一步先实例化对象，new出现的时候num已经有了初始化值，默认值0；
        new Student(30).print();//
    }
}
