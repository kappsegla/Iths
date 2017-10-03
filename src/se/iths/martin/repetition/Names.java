package se.iths.martin.repetition;

import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Names names = new Names();

        String firstName = names.getName("Enter first name: ");
        String lastName = names.getName("Enter last name: ");
        boolean woman = names.getBoolean("Are you a woman?");
        boolean married = names.getBoolean("Are you married?");
        String fullName = names.createFullName(firstName, lastName, woman, married); System.out.println(fullName);

    }

    public String createFullName(String firstName, String lastName, boolean woman, boolean married){
        if( !woman)
            return "Mr " + firstName + " " + lastName;
        else if(woman && !married)
            return "Ms " + firstName + " " + lastName;
        else
            return "Mrs " + firstName + " " + lastName;
    }

    public String getName(String s){
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        String text;
        do {
            text = sc.nextLine();
        }while( !isCharsOnly(text));

        return text;
    }

    private boolean isCharsOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            //Character.toLowerCase()  Minskar testbehovet till endast små bokstäver i intervallet.
            if( !(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'))
                return false;

        }
        return true;
    }


    public boolean getBoolean(String s){
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        String text;

        text = sc.nextLine();

        if( text.equals("No"))
            return false;
        if( text.equals("Yes"))
            return true;

        return false;
    }


}
