//模板设计模式
//冲泡咖啡法
abstract class CoffeineBeverage{
    //核心冲泡法
    final void prepareRecipe(){//封装算法：子类只能使用，不能改变顺序。
        boilWater();
        brew();
        pourInCup();
        //扩展；
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    final void boilWater(){//final修饰的原因是：不能在子类中再被覆写，只允许子类使用。
        System.out.println("烧水");
    }
    final void pourInCup(){
        System.out.println("将饮料倒入杯中");
    }
    //到底是冲泡还是浸泡，就需要再子类中来覆写了。
    abstract void brew();
    abstract void addCondiments();
    //钩子方法
    boolean customerWantsCondiments(){
        return true;
    }
}
class Coffee extends CoffeineBeverage{
    void brew(){
        System.out.println("冲泡咖啡");
    }
    void addCondiments(){
        System.out.println("加糖或者咖啡");
    }

}
class Tea extends CoffeineBeverage{
    void brew(){
        System.out.println("浸泡茶叶");
    }
    void addCondiments(){
        System.out.println("加柠檬");
    }
    public boolean customerWantsCondiments(){
        System.out.println("加柠檬不 ? y/n");
        String result = getUserInfo();
        if(result.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }
    private String getUserInfo(){
        String str = null;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        return str;
    }
}
public class Test7{
    public static void main(String[] args){
        CoffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        CoffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}