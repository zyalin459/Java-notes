package Basic.cityDistance;

import java.util.HashMap;
import java.util.Scanner;

public class CityDistance {
    private static HashMap<String, Integer> cityMap = new HashMap<>();
    private static int[][] distance;

    private static void setCityMap(Scanner in) {
        String input = in.next();
        while (!input.equals("###")) {
            cityMap.put(input, cityMap.size());
            input = in.next();
        }
    }

    private static void setDistance(Scanner in) {
        int size = cityMap.size();
        distance = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                distance[i][j] = in.nextInt();
            }
        }
    }

    private static int getDistance(String city1, String city2) {
        return distance[cityMap.get(city1)][cityMap.get(city2)];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        setCityMap(in);
        System.out.println("City imported.");
        setDistance(in);
        System.out.println("Distance imported.");

        String city1 = in.next();
        String city2 = in.next();

        int dis = getDistance(city1, city2);
        System.out.println("The distance between "+city1+" and "+city2+" is: "+dis);

        in.close();
    }
}
