package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    public Coin() {
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dollar");
        coinnames.put(50, "五毛");
        System.out.println(coinnames.keySet().size());
        System.out.println(coinnames);
        for (Integer k : coinnames.keySet()) {
            System.out.println(coinnames.get(k));
        }
    }

    public String getName(int amount) {
        if (coinnames.containsKey(amount))
            return coinnames.get(amount);
        else
            return "Not found";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);
    }
}
