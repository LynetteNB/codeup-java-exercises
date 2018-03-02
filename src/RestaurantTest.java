public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 150;
        dish.wouldRecommend = true;
        dish.nameOfDish = "Hey Hey Chicken";
        System.out.print("The cost of " + dish.nameOfDish + " is " + dish.costInCents + " cents and ");
        if(dish.wouldRecommend) {
            System.out.println("we would definitely recommend this dish!");
        } else {
            System.out.println("we would not recommend this dish.");
        }
        dish.eat();
    }
}