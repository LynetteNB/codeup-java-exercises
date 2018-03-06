public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"nice", "mean", "pretty", "ugly", "responsible", "ambitious", "pale", "tan", "productive", "lazy"};
        String[] nouns = {"man", "woman", "girl", "boy", "restaurant", "car", "cup", "phone", "computer", "planner"};
        System.out.println("Here is your server name:");
        System.out.println(adjectives[getRandomNum(adjectives.length)] + " - " + nouns[getRandomNum(nouns.length)]);

    }
    private static int getRandomNum(int length){
        return (int) Math.floor(Math.random()*length);
    }
}