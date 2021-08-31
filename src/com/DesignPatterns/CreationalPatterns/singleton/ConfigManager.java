package com.DesignPatterns.CreationalPatterns.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager(){}

    public void set(String setting, Object value) {
        settings.put(setting, value);
    }

    public Object get(String setting) {
        return settings.get(setting);
    }

    public static ConfigManager getInstance(){
        return instance;
    }

}
