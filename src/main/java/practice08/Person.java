package practice08;

public class Person {

    int personAge;
    java.lang.String personName;
    int personId;

    public Person() {
    }

    public Person(int id, java.lang.String Name, int Age) {
        setId(id);
        setName(Name);
        setAge(Age);
    }

    public void setId(int id) {

        personId = id;
    }

    public void setAge(int Age) {

        personAge = Age;
    }

    public void setName(java.lang.String Name) {

        personName = Name;
    }

    public int getId() {

        return personId;
    }

    public int getAge() {

        return personAge;
    }

    public java.lang.String getName() {

        return personName;
    }

    public java.lang.String introduce() {

        return backIntroduce();
    }

    public java.lang.String backIntroduce() {

        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId;
    }

}
