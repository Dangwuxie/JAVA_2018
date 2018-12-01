// public class Test{
//     public static void main(String[] args){
//         int [][] arr = new int [][] {
//             {1,2,3},
//             {1,2},
//             {1,2,3,4}
//         };
//         for (int i = 0;i < arr.length ; i++){
//             for(int j = 0;j < arr[i].length ;j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }

//     }
// }
public class Test{
    public static void main(String[] args){
        int [] data = new int[]{1,2};
        int [] x = null;
        // data[0] = 2;
        // data[1] = 4;
        x = data;//引用传递只能访问能访问到的元素；不然就是数组越界；
        x[1] = 6;
        for(int tmp : x){
            System.out.print(tmp+"、");
        }
    }
}