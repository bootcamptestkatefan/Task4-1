package practice04;
public class Worker extends Person{


    public Worker(){}

    public Worker (java.lang.String Name, int Age) {
        setName(Name);
        setAge(Age);
    }

    public java.lang.String introduce(){

        return backIntroduce() + " I am a Worker. I have a job.";
    }

}
