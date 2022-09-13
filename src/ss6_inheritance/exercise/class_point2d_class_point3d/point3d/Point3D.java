package ss6_inheritance.exercise.class_point2d_class_point3d.point3d;

import ss6_inheritance.exercise.class_point2d_class_point3d.point2d.Point2D;

public class Point3D extends Point2D {
    private double z = 0.0f;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        super.setXY(x,y);
        this.z = z;

    }


    public double[] getXYZ() {
        return new double[]{super.getX(),super.getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D " + "\"" + String.format("(%.2f,%.2f,%.2f)",super.getX(),super.getY(),getZ()) + "\"";
    }
}
