package se.iths.martin.v4.pokemon;

public class Pikachu extends Pokemon {

    @Override
    public void attack() {
        System.out.println("Piiika! Lightning bolt!");
    }

    @Override
    public void talk() {
        System.out.println("Pika pika pika?");
    }
}
