public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"nice", "mean", "pretty", "ugly", "responsible", "ambitious", "pale", "tan", "productive", "lazy"};
        String[] nouns = {"man", "woman", "girl", "boy", "restaurant", "car", "cup", "phone", "computer", "planner"};
        System.out.println("Here is your server name:");
        System.out.println(adjectives[getRandomNum()] + " - " + nouns[getRandomNum()]);

    }
    private static int getRandomNum(){
        return (int) Math.floor(Math.random()*10);
    }
}