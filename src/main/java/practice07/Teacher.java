package practice07;

public class Teacher extends Person{
    Klass TeacherKlass;

    public Teacher(){}

    public Teacher (java.lang.String TeacherName,  int Age) {
        setName(TeacherName);
        setAge(Age);
    }

    public Teacher (java.lang.String TeacherName,  int Age, Klass Klass) {
        setName(TeacherName);
        setKlass(Klass);
        setAge(Age);
    }

    public void setKlass(Klass Klass){

        TeacherKlass = Klass;
    }

    public Klass getKlass() {

        return TeacherKlass;
    }

    public java.lang.String introduce(){
        if(TeacherKlass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce() + " I am a Teacher. I teach Class " + TeacherKlass.getNumber() + ".";
        }
    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.getKlass().getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }


}
