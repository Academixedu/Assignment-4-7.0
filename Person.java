public class Person
{// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
    private String personName;
    private int    personAge;
    private int    personSal;
    private String personDept ;

    public Person(String personName, int personAge,int personSal, String personDept)
    {
      this.personName=personName;
      this.personAge=personAge;
      this.personSal=personSal;
      this.personDept=personDept;
    } 



    public String getPersonName()
    {
      return personName;
    }

    public void setPersonName(String personName)
    {
      this.personName=personName;
    }

    public int getPersonAge()
    {
     return personAge; 
    }

    public void setpersonAge(int personAge)
    {
      this.personAge=personAge;
    }

    public int getPersonSal()
    {
      return personSal;
    }

    public void setPersonSal(int personSal)
    {
      this.personSal=personSal;
    }

    public String getpersonDept()
    {
      return personDept;
    }

    public void setPersonDept( String personDept)
    {
      this.personDept=personDept;
    }


     




}
