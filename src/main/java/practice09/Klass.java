package practice09;

public class Klass {

    Integer KlassNumber;
    Student klassLeader;
    Student KlassMember;

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

    public void assignLeader(Student Student) {
        if (KlassMember != null) {
            setLeader(Student);
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader(){

        return klassLeader;
    }

    public void appendMember(Student Student){

        KlassMember = Student;
    }


}
