package practice08;

public class Student extends Person{
    Klass StudentKlass;

    public Student(){}

    public Student (int id, java.lang.String StudentName,  int Age, Klass StudentKlass) {
        setName(StudentName);
        setKlass(StudentKlass);
        setAge(Age);
        setId(id);
    }
    public void setKlass(Klass Klass){

        StudentKlass = Klass;
    }

    public Klass getKlass(){

        return StudentKlass;
    }

    public java.lang.String introduce(){
        Student Leader = StudentKlass.getLeader();
        if (this.StudentKlass.getLeader().equals(Leader)){
        return super.backIntroduce() + " I am a Student. I am Leader of Class "+ StudentKlass.getNumber() + ".";
        }
        else
        return super.backIntroduce() + " I am a Student. I am at Class " + StudentKlass.getNumber() + ".";
    }
}


//"I am a Student. I am at Class 2."