package mockitoexamplsexcercise;

import java.util.UUID;

public interface DeviceInt {
    public void addDevice(Device device,DBHelper dbHelper) throws DataBaseDwonException;

    public Device getDeviceByGUID(UUID guid) throws DeviceNotFoundException;

    public Boolean updateDevice(Device device,DBHelper dbHelper) throws DataBaseDwonException;
}
