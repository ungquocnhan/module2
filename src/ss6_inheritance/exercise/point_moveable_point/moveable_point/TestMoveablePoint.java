package ss6_inheritance.exercise.point_moveable_point.moveable_point;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3.4f,4.5f,5.6f,6.7f);
        System.out.println(moveablePoint.toString());

        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
