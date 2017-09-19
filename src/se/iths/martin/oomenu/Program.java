package se.iths.martin.oomenu;

public class Program {

    private Menu menu;

    public void start()
    {
        //Initiera menu
        menu = new Menu();
        //Lambda uttryck för att skapa execute metodens innehåll.
        menu.add("Alternativ 1", () -> System.out.println("Du valde alternativ 1" + menu.textalternativ.size()));
        menu.add("Alternativ 2", () -> System.out.println("Du valde alternativ 2"));
        //Anonym klass implementation
        menu.add("Alternativ 3", new MenuOption() {
            @Override
            public void execute() {
                System.out.println("Du valde alternativ 3");
            }
        });
        //Den långa vägen, skapa en klass som implementerar interfacet.
        menu.add("Alternativ 4", new Alt4MEnuOption());
        //Metodreferens till en metod som matchar interfacest metod
        menu.add("Alternativ 5", this::alt5);
        //Statisk version av metodreferens.
        menu.add("Alternativ 6", Program::alt6static);


        MenuOption menuOption = this::alt5;
        menuOption.execute();

        while(true) {
            //Visa menu och gör val
            menu.show();
            menu.execute(menu.val());
        }
    }

    public void alt5(){
        System.out.println("Alternativ 5");
    }
    public static void alt6static()
    {

    }

    public static void main(String[] args) {
        new Program().start();
    }
}
