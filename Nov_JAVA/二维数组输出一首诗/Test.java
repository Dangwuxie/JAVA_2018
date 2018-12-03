public class Test{
    public static void main(String[] args){
        char [][] data = new char [4][];
        data[0] = new char[]{'春','眠','不','觉','骁'};
        data[1] = new char[]{'处','处','闻','啼','鸟'};
        data[2] = new char[]{'夜','来','风','雨','声'};
        data[3] = new char[]{'花','落','知','多','少'};
        System.out.println("-------------横板-----------------");
        for(int i = 0;i < 4; i++){
            for(int j = 0;j < 5; j++){
                System.out.print(data[i][j]);
            }
            if(i%2 == 0){
                System.out.println('，');
            }
             else{
                System.out.println('。');
            }
        } 
         System.out.println("-------------竖版-----------------");
         for(int j = 0;j < 5; j++){
             for(int i = 0;i < 4; i++){
                 System.out.print(data[i][j]);
             }
             System.out.println();
         }
         System.out.println("。，。，");
    }
}