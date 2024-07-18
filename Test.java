public class Test {
  public static void main(String[] args) {
      Person person1 = new Person("John", 25);
      System.out.println("First Person:");
      System.out.println("Name: " + person1.getName());
      System.out.println("Age: " + person1.getAge());
      System.out.println();
      Person person2 = new Person();
      person2.setName("Alice");
      person2.setAge(30);
      System.out.println("Second Person:");
      System.out.println("Name: " + person2.getName());
      System.out.println("Age: " + person2.getAge());
  }
}
