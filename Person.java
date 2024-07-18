public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
  public class Myself {

    public String surname;
    public String name;
    public String gender;
    private int age;
    public Myself(String surname,String name,String gender,int age) {
        this.surname = surname;
        this.name = name;
        this.gender= gender;
        this.age = age;
        
    }


    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}


  
}
