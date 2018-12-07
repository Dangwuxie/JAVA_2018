//普通代码块：定义在方法中的代码块
public class Test{
    public static void main(String[] args){
        //普通代码块；
        {
            int x = 10;
            System.out.println(x);
        }
        int x = 20;
        //注意：此处定义的x是在普通代码块后面定义的；如果放在前面定义，就会出现错误，
        //即全局变量，不能再普通代码块内部再次进行定义并且赋值; 
        System.out.println(x);
    }
}