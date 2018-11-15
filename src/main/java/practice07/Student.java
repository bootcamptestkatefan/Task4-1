package practice07;

public class Student extends Person{
    Klass StudentKlass;

    public Student(){}

    public Student (java.lang.String StudentName,  int Age, Klass StudentKlass) {
        setName(StudentName);
        setKlass(StudentKlass);
        setAge(Age);
    }
    public void setKlass(Klass Klass){

        StudentKlass = Klass;
    }

    public Klass getKlass(){

        return StudentKlass;
    }

    public java.lang.String introduce(){
        return super.backIntroduce() + " I am a Student. I am at Class " + StudentKlass.getNumber() + ".";
    }
}


//"I am a Student. I am at Class 2."