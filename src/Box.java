public class Box {
    double width;
    double height;
    double deepth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        deepth = ob.deepth;
    }

    Box(double w, double h, double d) {
        width = w;
        deepth = d;
        height = h;
    }

    Box() {
        height = -1;
        width = -1;
        deepth = -1;
    }

    Box(double len) {
        height = deepth = width = len;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            Box b = (Box) obj;
            return this.deepth == b.deepth && this.width == b.width && this.height == b.height;
        }
        return false;
    }

    double volume() {
        return height * width * deepth;
    }
}

