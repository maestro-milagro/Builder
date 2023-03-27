public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if ((age==0)||(age<0)){
            throw new IllegalArgumentException("Age cannot be less than or equal to zero");
        }else {
            this.age = age;
            return this;
        }
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if((address==null)||(age==0)||(name==null)||(surname==null)){
            throw new IllegalStateException("Invalid user information entered");
        }
        return new Person(name,surname,address,age);
    }
}
