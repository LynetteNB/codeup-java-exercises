public class Dog extends Pet {

    public Dog(int age, int weight) {
        this.age = age;
        this.weight = weight;
        numberOfLegs = 4;
        predator = false;
        species = "dog";
    }
    public void makeSound(){
        System.out.println("Woof!");
    }
    public void eat(){
        System.out.println("Eating and making a mess everywhere at the same time!");
    }
}