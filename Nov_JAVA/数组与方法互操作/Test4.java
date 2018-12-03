//实现数组全拷贝
import java.util.Arrays;
public class Test4{
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[]{11,22,33,44,55,66,77,88,99,100};
        int[] result = Arrays.copyOf(arr1,20);
        System.arraycopy(arr2,0,result,10,10);
        printArray(result);
    }
    public static void printArray(int[] temp){
        for(int i = 0;i < temp.length; i++){
            System.out.print(temp[i]+"、");
        }
    }
}