public class EarthVolume {
    public static void main(String[] args) {
        double r = 6378;
        double v1 = (4.0/3) * Math.PI * Math.pow(r, 3);
        double v2 = v1 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + v1 + " and cubic miles is " + v2);
    }
}
