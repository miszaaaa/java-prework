public class Person {
    private final String firstName;
    private final String lastName;
    private int age;
    private String address;
    private String gender;
    private String email;
    private String phoneNumber;

    public Person(String firstName, String lastName, int age, String address, String gender, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person("Jan",
                "Kowalski",
                30,
                "Miodowa 14a 32 00-123 Bydgoszcz",
                "M",
                "email@email.com",
                "111 222 333");

        System.out.println(person.getName());
    }
}
