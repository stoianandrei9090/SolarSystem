package planets.models;

import java.time.LocalDateTime;

public class Result {

    private Planet planet;
    private Planet orbitsAround;
    private LocalDateTime dateTime;
    private double meanAnomaly;
    private double eccentricAnomaly;
    private double trueAnomaly;
    private double radiusVector;
    private XYZCoords xyzFromParent;

    public Result(Planet planet, Planet orbitsAround, double meanAnomaly,
                  double eccentricAnomaly, double trueAnomaly,
                  double radiusVector, XYZCoords xyzFromParent, LocalDateTime dateTime) {

        this.planet = planet;
        this.orbitsAround = orbitsAround;
        this.meanAnomaly = meanAnomaly;
        this.eccentricAnomaly = eccentricAnomaly;
        this.trueAnomaly = trueAnomaly;
        this.radiusVector = radiusVector;
        this.xyzFromParent = xyzFromParent;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return
                "Planet : " + planet.getName() + '\n' +
                "Orbits around : " + (orbitsAround == null ? "Sun" : orbitsAround.getName()) + '\n' +
                "Date\\Time : " + dateTime + '\n' +
                "Mean anomaly : " + meanAnomaly + " rads (" + Math.toDegrees(meanAnomaly) + " degs)" + '\n' +
                "Eccentric anomaly : " + eccentricAnomaly + " rads (" + Math.toDegrees(eccentricAnomaly) + " degs)" +
                        '\n' +
                 "True anomaly : " + trueAnomaly + " rads (" + Math.toDegrees(trueAnomaly) + " degs)" +
                        '\n' +
                 "Radius vector : " + radiusVector + '\n' +
                 "XYZ  coordinates from parent (heliocentric\\geocentric\\other) : " + xyzFromParent + "\n\n";
    }



}
