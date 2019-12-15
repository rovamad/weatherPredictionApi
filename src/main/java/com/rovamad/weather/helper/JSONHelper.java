package com.rovamad.weather.helper;

import java.util.HashMap;
import java.util.Map;

public final class JSONHelper {
    private JSONHelper() {
        
    }

    /**
     * 
     * @param message
     * @return
     */
    public static String errorMessage(String message) {
        Map<String, Object> response = new HashMap<>();

        response.put("success", Boolean.valueOf(false));
        response.put("message", message);

        return MarshallHelper.toJson(response);
    }

    /**
     * 
     * @param message
     * @return
     */
    public static String successMessage(String message) {
        Map<String, Object> response = new HashMap<>();

        response.put("success", Boolean.valueOf(true));
        response.put("message", message);

        return MarshallHelper.toJson(response);
    }
    
    public static String successMessageObj(String value, Object obj) {
        Map<String, Object> response = new HashMap<>();

        response.put("success", Boolean.valueOf(true));
        response.put(value, obj);

        return MarshallHelper.toJson(response);
    }

}

