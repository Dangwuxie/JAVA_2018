class Person {
    private String name;
    private int age;

    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setage(int i){
        if(i>0&&i<200){
            age = i;
        }
        else{
            age = 0;
        }
    }
    public int getage(){
        return age;
    }
    public void getPersonInfo(){
        System.out.println("姓名:"+name+"年龄:"+age);
    }
}
public class Test2{
    public static void main(String[] args){
        Person per = new Person();
        per.setage (30);
        per.setname ("张三");
        per.getPersonInfo();
    }
}