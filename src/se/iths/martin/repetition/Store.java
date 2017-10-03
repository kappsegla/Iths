package se.iths.martin.repetition;

public class Store {
    private int amount;
    private int profit;

    public Store(int p){
        profit = p;
    }

    public void addMoney(int amount){
        this.amount += amount;
    }

    public void removeMoney(int amount){
        this.amount -= amount;
    }

    public void shop(int numberOfCustomers)
    {
        addMoney(numberOfCustomers * profit);
    }
}
