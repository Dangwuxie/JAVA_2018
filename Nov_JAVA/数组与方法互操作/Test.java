public class Test{
    public static void main(String[] args){
        int [] arr1 = Init();
        Print(arr1);
        System.out.println();
        Modify(arr1);
        Print(arr1);
    }
    //方法返回数组；
    public static int[] Init(){
        return new int[] {1,2,3,4,5,6};
    }
    //方法接收数组
    public static void Print(int [] data){
        for(int tmp : data){
            System.out.print(tmp+"、");
        }
    }
    //方法修改数组
    public static void Modify(int [] data){
        for(int i = 0; i < data.length; i++){
            data[i] *= 2;
        }
    }
}