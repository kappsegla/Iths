package se.iths.martin.v4.intabs;

public class Program {

    //This method only takes animals that has the interface IPet
    public static void wash(Pet pet){
        pet.isCute();
    }


    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.isCute();

        Dog d = new Dog();
        Seal s = new Seal();

        wash(pet);
        wash(d);
        //Seal is not a Pet.
        //wash(s);

        //Mammal is abstract. Can't create instances
        //Mammal m = new Mammal();
        Mammal m = new Dog();

    }
}
