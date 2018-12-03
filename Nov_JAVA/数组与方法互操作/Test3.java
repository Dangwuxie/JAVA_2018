//实现部分数组拷贝
public class Test3{
    public static void main(String[] args){
        int [] arr1 = new int []{1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = new int []{11,22,33,44,55,66,77,88,99,111};
        System.arraycopy(arr2,2,arr1,2,4);
        printArray(arr1);
    }
    public static void printArray(int [] arr1){
        for(int i = 0;i < arr1.length; i++){
            System.out.print(arr1[i]+"、");
        }
    }

}