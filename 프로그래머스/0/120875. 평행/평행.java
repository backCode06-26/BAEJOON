import java.util.Arrays;

class Solution {
    public static double getAngle(int x1, int y1, int x2, int y2) {
        double angleRad = Math.atan2(y2 - y1, x2 - x1);
        double angleDeg = Math.toDegrees(angleRad);
        return (angleDeg + 360) % 360;
    }
    
    public int solution(int[][] dots) {
        Arrays.sort(dots, (a, b) -> a[0] == b[0] ?
                Integer.compare(a[1], b[1]) :
                Integer.compare(a[0], b[0])
        );

        double angle1 = getAngle(dots[0][0], dots[0][1], dots[1][0], dots[1][1]);
        double angle2 = getAngle(dots[2][0], dots[2][1], dots[3][0], dots[3][1]);

        return Math.abs(angle1 - angle2) < 1e-9 ? 1 : 0;
    }
}