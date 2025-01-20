public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("shreyansh", 21, "123 Main St");
        Person clonedPerson = new Person(originalPerson);

        System.out.println("Original Person: " + originalPerson.getName() + ", " + originalPerson.getAge() + ", " + originalPerson.getAddress());
        System.out.println("Cloned Person: " + clonedPerson.getName() + ", " + clonedPerson.getAge() + ", " + clonedPerson.getAddress());
    }
}

