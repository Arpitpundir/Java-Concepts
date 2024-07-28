package Interface;

public class OperateBMW implements OperateCar{
    @Override
    public int signalTurn(String direction, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int changeLanes(String direction, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int turn(String direction, double radius, double startSpeed, double endSpeed) {
        return 0;
    }
}
