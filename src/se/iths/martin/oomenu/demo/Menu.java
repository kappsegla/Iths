package se.iths.martin.oomenu.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<String> text = new ArrayList<>();
    private ArrayList<MenuOption> option = new ArrayList<>();

    public void add(String s, MenuOption menuOption) {
        text.add(s);
        option.add(menuOption);
    }

    public void show() {
        for (int i = 0; i < text.size(); i++) {
            System.out.println(i + 1 + ". " + text.get(i));
        }
    }

    public int choice() {
        System.out.println("Välj ett alternativ.");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void execute(int i) {
        option.get(i - 1).execute();
    }
}
