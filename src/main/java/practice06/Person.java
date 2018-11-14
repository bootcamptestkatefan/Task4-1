package practice06;

public class Person {

    int personAge;
    java.lang.String personName;

    public Person() {}

    public Person (java.lang.String Name, int Age){
        setName(Name);
        setAge(Age);
    }

    public void setAge (int Age){

        personAge = Age;
    }

    public void setName (java.lang.String Name){

        personName = Name;
    }

     public int getAge (){

        return personAge;
     }

     public java.lang.String getName (){

        return personName;
    }
     public java.lang.String introduce(){

        return backIntroduce();
    }

     public java.lang.String backIntroduce() {

         return "My name is " + getName() + ". I am " + getAge() + " years old.";
     }

}
