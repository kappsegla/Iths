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

        Employee e1 = new Employee("Martin", new Adress(), 43532);
        e1.adress.road = "Göteborgsvägen";
        employees.add(e1);

        e1 = new Employee(e1);
        employees.add(e1);

        e1 = new Employee("Kalle", new Adress(),12345);
        e1.adress.road = "Korsvägen";
        employees.add(0,e1);

        employees.get(1).name = "Kanin";
        employees.get(1).adress.road = "Mölndalsvägen";

        for (Employee e: employees ) {
            e.sayHello();
        }


        for (int i = 0; i < employees.size(); i++) {
            //if( employees.get(i).name.equals("Kalle")) {
                employees.get(i).sayHello();
                System.out.println(employees.get(i).adress.road);
            //}
        }



    }
}