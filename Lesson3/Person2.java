public class Person2 {
    private final String firstName;
    private final String lastName;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;

    public Person2(String firstName, String lastName, int age, String gender, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + ';' + lastName + ';' + age + ";" + gender + ';' + email + ';' + phoneNumber;
    }
}
