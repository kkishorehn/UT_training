package suites;

import java.util.ArrayList;
import java.util.UUID;

public class DeviceImpl implements DeviceInt {
    ArrayList<Device> devices;

    public DeviceImpl()
    {
        this.devices = new ArrayList<Device>();
    }


    public void addDevice(Device device)
    {
        devices.add(device);
    }

    public void removeDevice(Device device)
    {
        devices.remove(device);
    }

    public int getDeviceCount()
    {
        return devices.size();
    }

    public void clearDevices()
    {
        devices.clear();
    }

    public void deleteDeviceByIndex(int position)
    {
        devices.remove(position);
    }

    public Device getDeviceByGUID(UUID guid) throws DeviceNotFoundException {
        for(Device device:devices){
            if(device.getGuid().equals(guid)){
                return device;
            }
        }
        throw  new DeviceNotFoundException("Device with specified GUID is not found");
    }

    public Boolean updateDevice(Device device) {
        Boolean foundDevice = false;
        for(Device ob:devices) {
            if (ob.getGuid() == device.getGuid()) {
                devices.remove(ob);
                devices.add(device);
                foundDevice =true;
                break;
            }
        }
        return foundDevice;
    }
}
