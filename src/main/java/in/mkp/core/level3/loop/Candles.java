package in.mkp.core.level3.loop;

/**
 * Created by mkumar on 5/14/17.
 */
public class Candles {

    public static void main(String[] args) {
        Candles candles = new Candles();
        System.out.println("candles.candles(5, 2) = " + candles.candles(5, 2));
    }

    int candles(int candlesNumber, int makeNew) {
        int candles=0;
        int remaining = 0;
        do {
            candles+=candlesNumber;
            remaining+=candlesNumber;
            candlesNumber=remaining / makeNew;
            remaining=remaining % makeNew;
        } while (remaining >= makeNew || candlesNumber > 0);


        return candles;
    }
}
