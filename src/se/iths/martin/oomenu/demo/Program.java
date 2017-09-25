package se.iths.martin.oomenu.demo;

public class Program {
    private void start() {

        Menu m = new Menu();
        m.add("Menyalternativ 1", new MenuOption1());
        m.add("Alternativ 2", new MenuOption() {
            @Override
            public void execute() {
                System.out.println("Du valde alternativ 2");
            }
        });
        m.add("Menyalternativ 3", () -> System.out.println("Hej, alternativ 3 här"));

        m.add("Menyalternativ 4", () -> {
            System.out.println("Hej, alternativ 4 här");
            System.out.println("Hur mår du?");
        });
        m.add("Alt 5", this::alternativ5);

        m.show();

        int i = m.choice();
        m.execute(i);
    }

    public void alternativ5(){
        System.out.println("Alternativ 5 som metodreferens.");
    }


    public static void main(String[] args) {
        new Program().start();
    }

}
