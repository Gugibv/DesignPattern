package com.grey.designpattern.prototype.v2;

import java.util.HashMap;
import java.util.Map;

public class ColorRegistry {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static
    {
        colorMap.put("blue", new blueColor());
        colorMap.put("black", new blackColor());
    }
    public static void registerColor(String name, Color color) {
        colorMap.put(name, color);
    }
    public static Color getColor(String colorName)
    {
        Color color = colorMap.get(colorName);
        if (color != null) {
            return  (Color) colorMap.get(colorName).clone();
        }
        return null;
    }
}