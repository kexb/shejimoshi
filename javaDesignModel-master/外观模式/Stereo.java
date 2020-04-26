package facade;

public class Stereo {
    //使用单例饿汉模式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Stereo off ");
    }

    public void up() {
        System.out.println(" Stereo up ");
    }
}
