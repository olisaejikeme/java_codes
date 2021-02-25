// Constructors

public class Alpha15 {

    int age;
    String name;
     
    //Default constructor
    Alpha15() {
     this.name="Chaitanya";
     this.age=30;
    }
     
    //Parameterized constructor
    Alpha15(String n,int a){
     this.name=n;
     this.age=a;
    }
    public static void main(String args[]){
     Alpha15 obj1 = new Alpha15();
     Alpha15 obj2 = 
                new Alpha15("Steve", 56);
     System.out.println(obj1.name+" "+obj1.age);
     System.out.println(obj2.name+" "+obj2.age);
    }
 }