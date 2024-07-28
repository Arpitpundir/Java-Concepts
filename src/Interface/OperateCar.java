package Interface;

public interface OperateCar {
    int turn(String direction, double radius, double startSpeed, double endSpeed);
    int changeLanes(String direction, double startSpeed, double endSpeed);
    int signalTurn(String direction, double startSpeed, double endSpeed);
}
