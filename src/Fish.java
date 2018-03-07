public class Fish extends Pet {

    public Fish(int age, int weight) {
        this.age = age;
        this.weight = weight;
        numberOfLegs = 0;
        predator = false;
        species = "fish";
    }
    public void makeSound(){
        System.out.println("Glub Glub!");
    }

    public void eat(){
        System.out.println("Eating the flakes that pollute my home!");
    }
}