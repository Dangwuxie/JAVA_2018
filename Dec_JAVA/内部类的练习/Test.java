//内部类的练习
//所谓内部类就是在一个类的内部进行其他类结构的嵌套的操作
//例：内部类的简单定义：
// class Outer{
//     private String msg = "Hello World !";
//     class Inner{
//         public void print(){
//             System.out.println(msg);
//         }
//     }
//     public void fun(){
//         Inner in = new Inner();
//         in.print();
//     }
// }
// public class Test{
//     public static void main(String[] args){
//         Outer out = new Outer();
//         out.fun();
//     }
// }
//------------------------------------------------------------------------
//修改上述代码，要求把内部类拆开到外部，主方法代码不变，实现相同的功能
class Outer{
    private String name = "Hello World !";
    public String getName(){
        return name;
    }
    public void fun(){
        Inner in = new Inner(this);//此处的this代表的是Out out;初始化，传参；
        in.print();
    }
}
class Inner{
    private Outer out;
    //含参构造函数初始化
    public Inner(Outer out){
        this.out = out;//引用传递
    }
    public void print(){
        System.out.println(out.getName());
    }
}
public class Test{
    public static void main(String[] args){
        Outer out = new Outer();
        out.fun();
    }
}