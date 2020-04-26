
public class SingleClassResponsibility {
    public static void main(String[] args) {
        RoadVehicle1 RoadVehicle1 = new RoadVehicle1();
        RoadVehicle1.run("摩托车");
        RoadVehicle1.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehicle1 {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水里运行");
    }
}

