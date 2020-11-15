import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class hw {
    public static void main(String[] args) throws IOException, InterruptedException {

        Box b1 = new Box(1,2,3);
        Box b2 = b1;
        Box b3 = new Box(1,2,3);
        System.out.println(b1==b2);
        System.out.println(b1==b3);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));

        BoxWeight bw1 = new BoxWeight(1,2,3,4);
        BoxWeight bw2 = new BoxWeight(1,2,3,4);
        System.out.println(bw1.equals(bw2));

        String s = "25.356";
        Double adub = Double.valueOf(s);
        System.out.println("adub.doubleValue() = " + adub.doubleValue());

        int[] arr = {0,3,65,5,4,2,5,5,45,5};
    }
}
