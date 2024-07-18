public class Test{
public static void main(String[]args){
    Person p1=new Person("karthik",21,"Ameerpet",12456789);

    System.out.println("Person 1:");
    System.out.println("Name: "+p1.getName());
    System.out.println("Age : "+p1.getAge());
    System.out.println("Address : "+p1.getAddress());
    System.out.println("Phno : "+p1.getPhno());

    Person p2=new Person("",0,"",0);

    p2.setName("Sai");
    p2.setAge(22);
    p2.setAddress("Ameepet");
    p2.setPhno(789456123);

    System.out.println("Person 2:");
    System.out.println("Name: "+p2.getName());
    System.out.println("Age : "+p2.getAge());
    System.out.println("Address : "+p2.getAddress());
    System.out.println("Phno : "+p2.getPhno());
}
}
