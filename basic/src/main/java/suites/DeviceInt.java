package suites;

import java.util.UUID;

public interface DeviceInt {
    public void addDevice(Device device);

    public Device getDeviceByGUID(UUID guid) throws DeviceNotFoundException;

    public Boolean updateDevice(Device device);
}
