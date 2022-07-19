package Task1;

public class Main {
    public static void main(String[] args){
        SamsungPhone samsungPhone = new SamsungPhone("MyPhone","A70","128Gb",64,true);
        NokiaPhone nokiaPhone = new NokiaPhone("NokiaBest","N70-3","128Gb");

        samsungPhone.call();
        samsungPhone.recordVideo();
        samsungPhone.sendMassage();
        samsungPhone.takePhoto();

        nokiaPhone.call();
        nokiaPhone.sendMassage();
    }
}
