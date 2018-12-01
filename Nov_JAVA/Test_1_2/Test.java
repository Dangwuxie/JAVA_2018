//递归实现20！
public class Test{
    public static void main(String[] args){
        int x = 10;
        int sum = Recursion(x);
        System.out.println(sum);
    }
    public static int Recursion(int x){
        if(1 == x){
            return 1;
        }
        else{
            return x*Recursion(x - 1);
        }
    }
}