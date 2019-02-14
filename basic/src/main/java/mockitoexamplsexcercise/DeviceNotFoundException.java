package mockitoexamplsexcercise;

public class DeviceNotFoundException extends Exception {
    DeviceNotFoundException(String msg){
        super(msg);
    }
    DeviceNotFoundException(String msg, Throwable t){
        super(msg,t);
    }
}
