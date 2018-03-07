public class petTester {
    public static String getSpeciesInfo(Animal animal) {
        return animal.species;
    }

    public static void main(String[] args) {
        Pet Aeon = new Cat(11, 12);
        System.out.println(getSpeciesInfo(Aeon));
        Pet Daisy = new Dog(2, 25);
        System.out.println(getSpeciesInfo(Daisy));
        Pet WubALubADubDub = new Fish(1, 1);
        System.out.println(getSpeciesInfo(WubALubADubDub));
    }
}