//Java数组章节练习题
public class ArrayUtils{
     public static void main(String[] args){
        //TODO 测试    
         int [] data = new int []{1,3,5,7,9};
         int [] data2 = new int []{2,4,6,8,10}; 
        int MAX = arrayMaxElement(data);
        System.out.println("MAX="+MAX);
        printArray(data);
        int MIN = arrayMinElement(data);
        System.out.println("MIN="+MIN);
        printArray(data);
        int sum = arrayElementSum(data);
        System.out.println("SUM="+sum);
        printArray(data);
        int [] data3 = arrayJoin( data, data2);
        printArray(data3);
        printArray(data);
        int [] subb = arraySub(data,1,4);
        printArray(subb);
        printReversal(data);
        printArray(data);
    }
  // 1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
         //TODO 
         int [] arr = data;
         int i = 5;
         while(i>1){
             if(arr[0]<arr[5-i+1]){
                 int tmp = arr[0];
                 arr[0] = arr[5-i+1];
                 arr [5-i+1] = tmp;
             }
             i--;
         }
        return arr[0];
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        //TODO
        int [] arr = data;
        int i = 5;
         while(i>1){
             if(arr[0]>arr[5-i+1]){
                 int tmp = arr[0];
                 arr[0] = arr[5-i+1];
                 arr[5-i+1] = tmp;  
             }
             i--;
         }
        return arr[0];
    }

//     //3.计算数组值之和
    public static int arrayElementSum(int[] data){
        //TODO
        int sum = 0;
        for(int tmp : data){
            sum += tmp;
        }
        return sum;
    }
    //4.数组拼接
   // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
    public static int[] arrayJoin(int[] a, int[] b){
        //TODO
        int [] data3 = new int [10];
        int i = 0;
        while(i<5){
            data3[i] = a[i];
            data3[i+5] = b[i]; 
            i++;
        }
        return data3;
    }
    //5.数组截取
   // [start, end)
    //A {1,3,5,7,9} ->(A,1,3) > {3,5}
    public static int[] arraySub(int[] data,int start,int end){
        //TODO
        int x = (end-start);
        int [] arr3 = new int[3];
        int i = 0;
        while(i<x){
            arr3[i] = data[start];
            i++;
            start++;
        }
        return arr3;
    }
    //6.数组打印
    public static void printArray(int[] data){
       // TODO
        for(int tmp : data){
            System.out.print(tmp+"、");
        }
        System.out.println();
    }
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
        //TODO
        int l = 0;
        int r = data.length-1;
        while(l < r){
            int tmp = data[r];
            data[r] = data[l];
            data[l] = tmp;
            l++;
            r--;
        }
    }  
}