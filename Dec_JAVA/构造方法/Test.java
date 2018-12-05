class Person{
    // public String name;
    // public double salary;
    private String name;
    private double salary;
    //无参构造
    // public Person(){
    //     System.out.println("***********");
    // }
    //一个参数的方法重载;
     public Person (String n){
          name = n;
      }
      //可以通过构造方法的重载直接在类中改变对象的属性；
      //从而可以不用借助setter和getter 来改变类的私有变量；私有属性；
    public Person (String n,double i){
        name = n;
       // setSalary(i);
        salary = i;
    }
    // public void setName(String n){
    //     name = n;
    // }
    public String getName(){
        return name;
    }
    public void setSalary(double i){
        if(i>0 && i<200){
            salary = i;
        }else{
            salary = 0;
        }
    }
    public double getSalary(){
        return salary;
    }
    public void getPerson(){
        System.out.println("姓名："+name+"薪水"+salary);
    }
    //}
    //public Person(String n){
    //   name = n;
    //}
    //两个参数的方法重载
    //public Person(String n ,double s){
     //   name = n;
     //   salary = s;
    //}
}
public class Test{
    public static void main(String[] args){
       // Person per1 = new Person()；
        Person per2 = new Person("张三");
        Person per3 = new Person("张三",100);
        //System.out.println(per1.name + per1.salary);
       // System.out.println(per2.name + per2.salary);
       // System.out.println(per3.name + per3.salary);
        per2.getPerson();
        per3.getPerson();
    }
}