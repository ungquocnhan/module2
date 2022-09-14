package ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.square;

import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.rectangle.Rectangle;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square " + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
