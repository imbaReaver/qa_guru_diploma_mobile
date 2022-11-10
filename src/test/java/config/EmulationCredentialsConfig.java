package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:emulation.properties")
public interface EmulationCredentialsConfig extends Config {

    @Key("deviceName")
    String getDeviceName();

    @Key("platformVersion")
    String getPlatformVersion();

}
