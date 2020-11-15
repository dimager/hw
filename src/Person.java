public class    Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }

    public void displayPerson () {
        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("age = " + age);
    }
    public String getLast() {
        return lastName;
    }
}
