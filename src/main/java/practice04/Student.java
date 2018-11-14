package practice04;

public class Student extends Person{
    int StudentKlass;

    public Student(){}

    public Student (java.lang.String StudentName,  int Age, int Klass) {
        setName(StudentName);
        setKlass(Klass);
        setAge(Age);
    }
    public void setKlass(int Klass){

        StudentKlass = Klass;
    }

    public int getKlass(){

        return StudentKlass;
    }

    public java.lang.String introduce(){
        return backIntroduce() + " I am a Student. I am at Class " + getKlass() + ".";
    }
}


//"I am a Student. I am at Class 2."