public class BurgerTester {
    public static void main(String[] args) {
        System.out.println("Our most popular topping at the moment is " + BurgerTools.mostPopularTopping + "!");
        System.out.println("Our burgers are cooked at " + BurgerTools.temperatureWhenCooked + " degrees!");
        System.out.println("Our burgers usually last " + BurgerTools.averageDaysBeforeExpiration + " days before expiring!");

        BurgerTools.grill();
        BurgerTools.mostPopularTopping = "Lettuce";
        BurgerTools.temperatureWhenCooked = 400;
        System.out.println("Our most popular topping at the moment is " + BurgerTools.mostPopularTopping + "!");
        System.out.println("Our burgers are cooked at " + BurgerTools.temperatureWhenCooked + " degrees!");

    }
}