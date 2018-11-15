package practice08;

public class Klass {

    Integer KlassNumber;
    Student klassLeader;

    public Klass() {}

    public Klass (Integer Number){

        setKlass(Number);

    }

    public void setKlass (Integer Number){

        KlassNumber = Number;
    }

    public Integer getNumber (){

        return KlassNumber;
    }

    public String getDisplayName(){

        return "Class " + getNumber();
    }

    public void setLeader(Student Student){

        klassLeader = Student;
    }

    public void assignLeader(Student Student){

        setLeader(Student);
    }

    public Student getLeader(){

        return klassLeader;
    }




}
