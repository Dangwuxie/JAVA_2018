//递归实现20！
public class Test{
    public static void main(String[] args){
        int x = 20;
        long sum = Recursion(x);
        System.out.println(sum);
    }
    public static long Recursion(int x){
        if(1 == x){
            return 1L;
        }
        else{
            return x*Recursion(x - 1);
        }
    }
}