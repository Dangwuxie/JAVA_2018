class A{
    private String name = "张三";
    public String getName(){
        return name;
    }
}
class B{
    private int age = 20;
    public int getAge(){
        return age;
    }
}
class Outer{
    private class InnerClassA extends A{
        public String name(){
            return super.getName();
        }
    }
    private class InnerClassB extends B{
        public int age(){
            return super.getAge();
        }
    }
    public String name(){
        return new InnerClassA().name();
    }
    public int age(){
        return new InnerClassB().age();
    }
}
public class Test2{
    public static void main(String[] args){
        Outer out = new Outer();
        System.out.println(out.name());
        System.out.println(out.age());
    }
}