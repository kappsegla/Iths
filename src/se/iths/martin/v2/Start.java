package se.iths.martin.v2;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args)
    {
/*
        Person p1 = new Person("Martin",true);
        p1.setFirstName("Martin");
        p1.setLastName("Blomberg");

        HotDogStand sibylla = new HotDogStand(10);
        System.out.println(p1.getFirstName() + " is hungry = " + p1.isHungry());
        sibylla.feed(p1);
        System.out.println(p1.getFirstName() + " is hungry = " + p1.isHungry());
        System.out.println("HotDogs left: " + sibylla.hotDogs);
*/
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.name = "Martin";
        e1.adress = new Adress();
        e1.adress.road = "Göteborgsvägen";
        employees.add(e1);

        employees.add(e1);

        e1 = new Employee();
        e1.name = "Kalle";
        e1.adress = new Adress();
        e1.adress.road = "Korsvägen";
        employees.add(0,e1);

        employees.get(1).name = "Kanin";

        for (int i = 0; i < employees.size(); i++) {

            if( employees.get(i).name.equals("Kalle")) {
                employees.get(i).sayHello();
                System.out.println(employees.get(i).adress.road);
            }
        }



    }
}