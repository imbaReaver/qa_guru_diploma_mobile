package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:browserstack.properties")
public interface BrowserstackCredentialsConfig extends Config {

    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();

    @Key("app")
    String getApp();

    @Key("device")
    String getDevice();

    @Key("osVersion")
    String getOsVersion();

    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("name")
    String getName();

}
