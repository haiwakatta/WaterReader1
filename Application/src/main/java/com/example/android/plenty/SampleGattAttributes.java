package com.example.android.plenty;

import java.util.HashMap;

public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String WATER_LEVEL_MEASURMENT = "82460002-4098-1000-8666-00805f9b34fb";

    static {
        //Services
        attributes.put("00001110-2222-1002-8010-00805f9b34fb", "Water Level Service");
        //Characteristics
        attributes.put(WATER_LEVEL_MEASURMENT, "Water Level Measurement");
        attributes.put("82460002-4098-1000-8666-00805f9b34fb", "Water Level String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
