package practice07;

public class Klass {

        Integer KlassNumber;

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




}
