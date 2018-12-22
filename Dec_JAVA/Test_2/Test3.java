//3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，
//其中每一个数字(从第三个数字起)都是前两个数字的和。
//创建一个方法，接受一个整数参数，
//并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
//例如，如果运行 java Fibonacci 5(Fibonacci为类名)，
//那么输出应该是1、1、2、3、5。 
public class Test3{
    //递归的方法不能逐一输出;
    // public static void Fibonacci(int n){
    //     if(0 == n){
    //         return;
    //     }
    //     else if(1 == n || 2 == n){
    //         //System.out.print(1+"、");
    //         //System.out.println(1);
    //        System.out.println(1);
    //     }
    //     else{
    //         //System.out.println(Fibonacci(n-1)+Fibonacci(n-2)+"、");
    //        // return Fibonacci(n-1)+Fibonacci(n-2);
    //        // System.out.println(Fibonacci(n-1)+Fibonacci(n-2));
    //        //System.out.print()
    //     }
    // }
    public static void Fibonacci(int n){
        int[]arr = new int [20];
        arr[1] = arr[0] = 1;
        for(int i = 0;i < n;i++){
            if(i == 0||i == 1){
                System.out.print(arr[i]);
                System.out.print('\u0000');
            }
            else{
                System.out.print(arr[i] = arr[i-1]+arr[i-2]);
                System.out.print('\u0000');
            }
        }
    }
    public static void main(String[] args){
        // System.out.println(Fibonacci(7));
        Fibonacci(7);
    }
}