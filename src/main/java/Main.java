public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jane", "Doe", "female", 25);
        Person mother = new Person("Jade", "Doe", "female", 50);
        Person father = new Person("John", "Doe", "male", 45);

        person.getMother();
        System.out.println(person.getMother());
        person.addParents(mother, father);
        System.out.println(person.getMother().getName());

    }
}