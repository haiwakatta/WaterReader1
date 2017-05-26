/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String WATER_LEVEL_MEASURMENT = "82460002-4098-1000-8666-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("00001110-2222-1002-8010-00805f9b34fb", "Water Level Service");
        // Sample Characteristics.
        attributes.put(WATER_LEVEL_MEASURMENT, "Water Level Measurement");
        attributes.put("82460002-4098-1000-8666-00805f9b34fb", "Water Level String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
