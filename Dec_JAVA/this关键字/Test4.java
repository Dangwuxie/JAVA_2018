class Person{
    // private String name;
    // private int age;
    public void print(){
        System.out.println("[PRINT]方法:"+this);
    }
}
public class Test4{
    public static void main(String[] args){
        Person p1 = new Person();
        // System.out.println("[MAIN]方法："+p1);
        p1.print();
        System.out.println("************************");
        Person p2 = new Person();
        System.out.println("[MAIN]方法："+p2);
        System.out.println("[MAIN]方法："+p1);
        p2.print();
        
    }
}
//只要对象调用了本类中的方法，这个this就表示当前执行的对象
// [MAIN]方法：Person@15db9742
// [PRINT]方法:Person@15db9742
// ************************
// [MAIN]方法：Person@6d06d69c
// [PRINT]方法:Person@6d06d69c