//java对数组的支持
//实现数组排序
public class Test1{
    public static void main(String[] args){
        int [] arr1 = new int[] {1,44,31,17,25};
        char [] arr2 = new char[] {'z','f','b','h'};
        java.util.Arrays.sort (arr1);
        java.util.Arrays.sort (arr2);
        printArray(arr1);
        printArray(arr2);
    }
    public static void printArray(int [] arr1){
        for(int i = 0;i < arr1.length; i++){
            System.out.print(arr1[i]+"、");
        }
        System.out.println();
    }
    //方法重载
    public static void printArray(char [] arr2){
        for (int i = 0;i < arr2.length; i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
    }
}