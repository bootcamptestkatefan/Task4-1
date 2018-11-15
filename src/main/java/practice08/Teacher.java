package practice08;

public class Teacher extends Person{
    Klass TeacherKlass;

    public Teacher(){}

    public Teacher (int id, java.lang.String TeacherName,  int Age) {
        setName(TeacherName);
        setAge(Age);
        setId(id);
    }

    public Teacher (int id, java.lang.String TeacherName,  int Age, Klass Klass) {
        setName(TeacherName);
        setKlass(Klass);
        setAge(Age);
        setId(id);
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
