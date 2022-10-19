package inheritance2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(43.5);
        cy.setLength(34.0);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为："+volume);
    }
}
