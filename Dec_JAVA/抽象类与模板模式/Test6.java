//模板设计模式
//冲泡咖啡法
class Coffee{
    void prepareRecipe(){
        boilWater();
        brewCoffee();
        pourCoffee();
        addSugerAndMilk();
    }
    void boilWater(){
        System.out.println("烧水");
    }
    void brewCoffee(){
        System.out.println("用水冲咖啡");
    }
    void pourCoffee(){
        System.out.println("导入杯中");
    }
    void addSugerAndMilk(){
        System.out.println("加糖或者牛奶");
    }
}
class Tea{
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
    void boilWater(){
        System.out.println("烧水");
    }
    void steepTeaBag(){
        System.out.println("泡茶包");
    }
    void pourInCup(){
        System.out.println("倒入杯中");
    }
    void addLemon(){
        System.out.println("加柠檬");
    }
}
public class Test6{
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}