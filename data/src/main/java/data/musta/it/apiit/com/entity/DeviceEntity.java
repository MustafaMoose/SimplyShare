package data.musta.it.apiit.com.entity;

import android.net.wifi.p2p.WifiP2pDevice;

/**
 * Created by musta on 05-Jan-18.
 */

public class DeviceEntity {
    private String ipAddress;
    private WifiP2pDevice device;

    public DeviceEntity(String ipAddress, WifiP2pDevice device) {
        this.ipAddress = ipAddress;
        this.device = device;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public WifiP2pDevice getDevice() {
        return device;
    }

    public void setDevice(WifiP2pDevice device) {
        this.device = device;
    }
}