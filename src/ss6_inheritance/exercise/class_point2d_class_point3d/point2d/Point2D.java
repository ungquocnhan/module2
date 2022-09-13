package ss6_inheritance.exercise.class_point2d_class_point3d.point2d;

public class Point2D {
    private double x = 0.0f;
    private double y = 0.0f;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        return new double[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "Point2D "+ "\""+ String.format("(%.2f,%.2f)",x,y) + "\"";
    }

}
