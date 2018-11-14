package practice07;

public class Teacher extends Person{
    Integer TeacherKlass;

    public Teacher(){}

    public Teacher (java.lang.String TeacherName,  int Age) {
        setName(TeacherName);
        setAge(Age);
    }

    public Teacher (java.lang.String TeacherName,  int Age, Integer Klass) {
        setName(TeacherName);
        setKlass(Klass);
        setAge(Age);
    }

    public void setKlass(Integer Klass){

        TeacherKlass = Klass;
    }

    public Integer getKlass() {

        return TeacherKlass;
    }

    public java.lang.String introduce(){
        if(getKlass() == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce() + " I am a Teacher. I teach Class " + getKlass() + ".";
        }
    }

}
