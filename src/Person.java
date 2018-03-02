public class Person{
    private String name;

    public void sayHello() {
        System.out.println("Hey there " + name + "!");
    }
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) {
        Person persona = new Person("Lynette");
        System.out.println(persona.getName());
        persona.setName("Fito");
        persona.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); TRUE
//        System.out.println(person1 == person2); FALSE

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); TRUE

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); JOHN
//        System.out.println(person2.getName()); JOHN
//        person2.setName("Jane");
//        System.out.println(person1.getName()); JANE
//        System.out.println(person2.getName()); JANE
    }
}