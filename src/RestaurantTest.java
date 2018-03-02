public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.setCostInCents(150);
        dish.setWouldRecommend(true);
        dish.setNameOfDish("Hei Hei Chicken");
        System.out.print("The cost of " + dish.getNameOfDish() + " is $");
        System.out.printf("%.2f and ", (double) dish.getCostInCents()/100);
        if(dish.isWouldRecommend()) {
            System.out.println("we would definitely recommend this dish!");
        } else {
            System.out.println("we would not recommend this dish.");
        }
        dish.eat();

        RestaurantDish dish2 = new RestaurantDish(10000, "Baby You Can Chive My Car Burger", false);
        System.out.print("The cost of " + dish2.getNameOfDish() + " is $");
        System.out.printf("%.2f and ", (double) dish2.getCostInCents()/100);
        if(dish2.isWouldRecommend()) {
            System.out.println("we would definitely recommend this dish!");
        } else {
            System.out.println("we would not recommend this dish.");
        }
        dish2.eat();
    }
}