public class Test{
    public static void main(String[] args){
        //int [] x = new int [5];
        //还可以这样分布开辟数组空间
        //int x [] = null;
        //x = new int[5];//new一出现，就会在堆上开辟内存空间
        //返回数组的长度；
       // System.out.println(x.length);
    //    x[0] = 0;
    //    x[1] = 1;
    //    x[2] = 2;
    //    x[3] = 3;
    //    x[4] = 4;
    //    for(int i = 0;i < 5; i++){
    //        System.out.println(x[i]);//通过循环控制索引下标更改
    //    }
    //另外一种循环输出方法;数组遍历
    //for-each循环
    //每次取一个，只要data数组中的元素不为空，就一直取下去
    //仅限于读取，不能修改数组内容
    //修改数组内容只能用for循环
    // for(int temp : x){
    //     System.out.println(temp);
    // }
    int [] data = null;
    data = new int [5];
    int [] x = data;
    x[0] = 0;
    x[1] = 1;
    x[2] = 2;
    x[3] = 3;
    x[4] = 4;
    System.out.println(x.length);
    for(int i = 0 ; i<x.length ; i++){
        System.out.print(x[i]+"、");
    }
    }
}