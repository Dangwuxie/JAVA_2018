public class Test1{
    public static void main(String[] args){
        int [] x = null;//引用，对内存别名，一律是4个字节
        int [] y = null;
        x = new int[3];
        x [0] = 0;
        x [1] = 1;
        y = x;//多个栈内存指向同一个堆内存；
        y [2] = 2;
        for(int i = 0;i < x.length ; i++){
            System.out.println(x[i]);
        }
    }
}