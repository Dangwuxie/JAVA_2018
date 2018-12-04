class Person{
    public int a;
    public String witch;
    public void fun() {
        System.out.print(witch+'在'+a+'岁'+"玩");
    }
}
public class Test{
       public static void main (String[] args){
            Person per = new Person();
        per.a = 30;
        per.witch = "asasd";
        per.fun();
        Person tom = new Person();
        System.out.print(tom.a);
        System.out.print(tom.witch);

       }
}