public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    @Override
    double volume() {
        System.out.println("override volume");
        return super.volume();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            BoxWeight bw = (BoxWeight) obj;
            return super.equals(obj) && bw.weight == this.weight;
        }
        return false;
    }
}
