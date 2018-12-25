class A{
    private String name = "S类的普通私有属性";
    public String getName(){
        return this.name;
    }
}
class B{
    private int age = 23;
    public int getAge(){
        return this.age;
    }
}
class C{
    class InnerClassA extends A{
        public String name(){
            return super.getName();
        }
    }
    class InnerClassB extends B{
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
public class Test5{
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.name());
        System.out.println(c.age());
    }
}