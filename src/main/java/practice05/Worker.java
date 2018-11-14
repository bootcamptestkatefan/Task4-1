package practice05;
public class Worker extends Person{

    public Worker (java.lang.String Name, int Age) {
        setName(Name);
        setAge(Age);
    }

    public java.lang.String introduce(){

        return super.backIntroduce() + " I am a Worker. I have a job.";
    }

}
