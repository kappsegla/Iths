package se.iths.martin.repetition;


public class TentaExempel {
    public int power(int x, int y){
        int produkt = 1;
        for (int i = 0; i < y; i++) {
            produkt *=x;
        }
        return produkt;

        //return (int) Math.pow(x, y);
    }



}
