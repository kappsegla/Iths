package se.iths.martin.v2;

public class Employee {
    //Attribute
    public String name;
    public Adress adress;
    public int phoneNumber;

    //Default constructor
    public Employee()
    {

    }

    public Employee(String name, Adress adress, int phoneNumber)
    {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    //Copy constructor
    public Employee(Employee e) {
        this.name = e.name;
        this.adress = new Adress(e.adress);
        this.phoneNumber = e.phoneNumber;
    }



    public void sayHello() {
        System.out.println("Hello, my name is " + name );
    }
}
