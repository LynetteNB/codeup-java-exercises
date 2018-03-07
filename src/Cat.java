public class Cat extends Pet {
    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
        numberOfLegs = 4;
        predator = false;
        species = "cat";
    }
    public void makeSound(){
        System.out.println("Meow!");
    }
    public void eat(){
        System.out.println("Eating from my fish bowl!");
    }
}