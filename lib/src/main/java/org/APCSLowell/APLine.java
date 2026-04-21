package org.APCSLowell;

public class APLine {
    private double a, b, c;
    public APLine(double x, double y, double z) {
        a=x;
        b=y;
        c=z;
    }
    public boolean isOnLine(double x, double y) {
        return a * x + b * y + c == 0.0;
    }
    public double getSlope() {
        return (-a/b);
    }
}
