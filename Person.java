public class Person{
// Take 4 fields
public String EmpName;
public int EmpAge;
private String EmpAddress;
private int EmpNumber;
  //Create Getters and Setters
public String getEmpName() {
  return EmpName;
}
public void setEmpName(String empName) {
  EmpName = empName;
}
public int getEmpAge() {
  return EmpAge;
}
public void setEmpAge(int empAge) {
  EmpAge = empAge;
}
public String getEmpAddress() {
  return EmpAddress;
}
public void setEmpAddress(String empAddress) {
  EmpAddress = empAddress;
}
public int getEmpNumber() {
  return EmpNumber;
}
public void setEmpNumber(int empNumber) {
  EmpNumber = empNumber;
}
  // Implement Constructor argumented
public Person(String empName, int empAge, String empAddress, int empNumber) {
  EmpName = empName;
  EmpAge = empAge;
  EmpAddress = empAddress;
  EmpNumber = empNumber;
}
  
  // Include private
}
