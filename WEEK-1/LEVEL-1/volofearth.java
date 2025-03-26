/*7) Write a Program to compute the volume of Earth in
km^3 and miles^3
Hint =&gt; Volume of a Sphere is (4/3) * pi * r^3 and radius
of earth is 6378 km */
public class volofearth {
    public static void main(String args[]) {
        double radiusKm = 6378;
        double pi = Math.PI;   
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        double volumeMi3 = volumeKm3 * 0.239913;
        
        System.out.printf("Volume of Earth: %.2f km³%n", volumeKm3);
        System.out.printf("Volume of Earth: %.2f mi³%n", volumeMi3);
    }
}
