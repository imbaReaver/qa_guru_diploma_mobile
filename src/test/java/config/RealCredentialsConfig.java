package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:real.properties")
public interface RealCredentialsConfig extends Config {

    @Key("deviceName")
    String getDeviceName();

    @Key("platformVersion")
    String getPlatformVersion();

}
