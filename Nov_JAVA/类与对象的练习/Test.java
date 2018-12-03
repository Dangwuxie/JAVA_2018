class Person{
    public String name;
    public int age;
    public void fun(){
        System.out.println(name+"在"+age+"打豆豆");
    }
}
public class Test{
        public static void main(String[] args){
            Person per = new Person();
            per.name = "马云";
            per.age = 20;
            per.fun();
            Person per1 ;
            per1 = per;
            per1.name = "鹏哥";
            per.fun();
        }
}