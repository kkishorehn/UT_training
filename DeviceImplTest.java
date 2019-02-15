package suites;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.testng.Assert.assertEquals;

public class DeviceImplTest {



    @BeforeMethod
    public void test2()
    {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void test3()
    {
        System.out.println("After Method");
    }

    @Test
    public void testAddDevices()
    {
        DeviceImpl device_list = new DeviceImpl();
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        Device device1 = new Device(uuid1,"Device1","Windows","Device1.epm.blr.novell.com");
        Device device2 = new Device(uuid2,"Device2","Linux","Device2.epm.blr.novell.com");

        device_list.addDevice(device1);
        device_list.addDevice(device2);

        assertEquals(2,device_list.getDeviceCount());
    }

    @Test
    public void testRemovalOfDevices()
    {
        DeviceImpl device_list = new DeviceImpl();
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        Device device1 = new Device(uuid1,"Device1","Windows","Device1.epm.blr.novell.com");
        Device device2 = new Device(uuid2,"Device2","Linux","Device2.epm.blr.novell.com");

        device_list.addDevice(device1);
        device_list.addDevice(device2);

        assertEquals(2,device_list.getDeviceCount());
        device_list.removeDevice(device1);

        assertEquals(1,device_list.getDeviceCount());
    }

    @Test
    public void testDeviceByUuid() throws DeviceNotFoundException {
        DeviceImpl device_list = new DeviceImpl();
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        Device device1 = new Device(uuid1,"Device1","Windows","Device1.epm.blr.novell.com");
        Device device2 = new Device(uuid2,"Device2","Linux","Device2.epm.blr.novell.com");

        device_list.addDevice(device1);
        device_list.addDevice(device2);

        assertEquals(device1,device_list.getDeviceByGUID(uuid1));

    }
    @BeforeClass
    public void test1()
    {
        System.out.println("Before Class");
    }

}