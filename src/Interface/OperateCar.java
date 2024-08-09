package Interface;

public interface OperateCar {

    int turn(String direction, double radius, double startSpeed, double endSpeed);
    int changeLanes(String direction, double startSpeed, double endSpeed);
    int signalTurn(String direction, double startSpeed, double endSpeed);
    default int deaultMethod(){
        System.out.println(this.interfacePrivateMethod());
        System.out.println(OperateCar.interfacePrivateStaticMethod());
        return 0;
    }

    static public String interfaceStaticMethod(){
        return "From Interface Static Method";
    }

    private String interfacePrivateMethod(){
        return "From Interface Private Method";
    }

    static private String interfacePrivateStaticMethod(){
        return "From Interface Private Static Method";
    }
}
