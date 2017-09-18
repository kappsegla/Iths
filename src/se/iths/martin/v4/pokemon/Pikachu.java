package se.iths.martin.v4.pokemon;

public class Pikachu extends Pokemon {

    private String nickname;

    public Pikachu(String name)
    {
        setNickname(name);
    }

    @Override
    public void attack() {
        System.out.println( getNickname() + " Lightning bolt!");
    }

    @Override
    public void talk() {
        System.out.println("Pika pika pika?");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
