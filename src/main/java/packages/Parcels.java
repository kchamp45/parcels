package packages;

import java.util.HashMap;
import java.util.Map;

public class Parcels {
    public int L;
    public int W;
    public int H;
    public int Weight;
    public int cost;

    Map<String, Integer> costByWt = new HashMap<String, Integer>();

    public Parcels() {
        costByWt.put("low", 5);
        costByWt.put("mid", 10);
        costByWt.put("high", 20);
    }
    public int calcVolume(int L, int W, int H) {
        return (L * W * H);
    }

    public int costToShip(int Weight) {

        if(Weight <= 1) {
            cost = costByWt.get("low");
        } else if(Weight >1 && Weight < 10) {
            cost = costByWt.get("mid");
        } else if(Weight >= 10) {
            cost = costByWt.get("high");
        } else {
            System.out.println("Please enter a valid weight.");
        }
        return cost;
    }
}
