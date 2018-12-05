class Person{
    //public 就是随便都能调用，外部或者里面;
   // public String name;
    //public double salary;
    private String name;
    private double salary;
    public void setName(String n){
        name = n;
    }
    public void setSalary(double s){
        if(s < 0 || s > 10000){
            System.out.println("余额错误！");
        }else{
            salary = s;
        }
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void fun(){
        System.out.print(name+"存款为"+"$"+salary);
    }
}



public class Test4{
    public static void main(String[] args){
        Person per = new Person();
        // per.name = "张三";
        // per.salary = 155;
        // per.fun();
       // per.setName("张三");
        per.setSalary(-100);
        per.fun();
        System.out.println(per.getName());
        System.out.println(  per.getSalary());
        
    }
}