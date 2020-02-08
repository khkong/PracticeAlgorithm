public class Solution5313 {


    public double angleClock(int hour, int minutes) {
        double angleHour = (360.0 / 12.0 * hour) % 360;
        double addAngleHour = (30.0 / 60.0 * minutes) % 30;
        double minutesAngle = (360.0 / 60 * minutes) % 360;

        double a = Math.abs(minutesAngle - (angleHour + addAngleHour));
        double b = Math.abs(360.0 - a);

        return Math.min(a, b);
    }
}
