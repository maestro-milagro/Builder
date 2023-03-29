import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    public boolean hasAge() {
        if (age == 0) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        }
        return false;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder()
                .setSurname(this.surname)
                .setAge(1)
                .setAddress(this.address);
        return personBuilder;
    }

    @Override
    public String toString() {
        return "name - " + name +
                " surname - " + surname +
                " age - " + age +
                " address - " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, age);
    }


}
