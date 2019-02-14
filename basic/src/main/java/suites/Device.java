package suites;

import java.util.UUID;

public class Device {
    private UUID guid;
    private String name;
    private String platform;
    private String dns;

    public Device(UUID guid, String name, String platform, String dns) {
        this.guid = guid;
        this.name = name;
        this.platform = platform;
        this.dns = dns;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }



    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    @Override
    public String toString() {
        return "Device{" +
                "guid=" + guid +
                ", name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", dns='" + dns + '\'' +
                '}';
    }
}
