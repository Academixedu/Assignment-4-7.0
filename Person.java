

    public class Person{
        // Take 4 fields
          //Create Getters and Setters
          // Implement Constructor argumented
          // Include private
          private int Eid;
          private String Ename ;
          private String Esurname;
          private int Esal;

          public int getEid() {
            return Eid;
        }
        
        public void setEid(int id) {
            this.Eid = id;
        }
        public String getEname() {
            return Ename;
        }
        
        public void setEname(String name) {
            this.Ename = name;
        }
        public String getEsurname() {
            return Esurname;
        }
        
        public void setEsurname(String surname) {
            this.Esurname = surname;
        }
        public int getEsal() {
            return Esal;
        }
        
        public void setEsal(int sal) {
            this.Esal = sal;
        }
        public  Person(int id, String name,String surname,int sal) {
            this.Eid = id;
            this.Ename = name;
            this.Esurname = surname;
            this.Esal = sal;


        }

 }

