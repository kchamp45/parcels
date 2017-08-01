package packages;

public class Parcels {
    public int L;
    public int W;
    public int H;
    public int Weight;

    public Parcels(int L, int W, int H, int Weight) {
        this.L = L;
        this.W = W;
        this.H = H;
        this.Weight = Weight;
    }
    public int volume(int L, int W, int H) {
        return (L * W * H);
    }
}
