package org.opentripplanner.openstreetmap;

import java.util.Arrays;

/**
 * An enum for OSM smoothness values (in order) found at https://wiki.openstreetmap.org/wiki/Key:smoothness
 * @param order
 * @param code
 */
public enum OSMSmoothness {
    // the higher the position, the more smooth (worse values go at the beginning)
    IMPASSABLE,
    VERY_HORRIBLE,
    HORRIBLE,
    VERY_BAD,
    BAD,
    INTERMEDIATE,
    GOOD,
    EXCELLENT;

    public static OSMSmoothness parseFrom(String code) {
        return valueOf(code.toUpperCase());
    }

    public static OSMSmoothness parseOrNull(String code) {
        if (code == null) {
            return null;
        }
        String upperCode = code.toUpperCase();
        return Arrays.stream(OSMSmoothness.values())
            .filter(smoothness -> smoothness.name().equals(upperCode))
            .findFirst()
            .orElse(null);
    }
}
