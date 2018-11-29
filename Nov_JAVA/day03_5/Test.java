public class Test{
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        for(x=1;x<=9;x++){
            for(y=1;y<=x;y++){
                System.out.print(x+"*"+y+"="+(y*x)+'\t');
            }
            System.out.println();
        }
        
    }
}