package garrisonms.entity.warriors;

import java.util.HashMap;
import java.util.Map;

public enum  Rank {
    RECRUIT(1, "recruit"),
    SERGEANT(2, "sergeant"),
    LIEUTENANT(3, "lieutenant");

    private String label;
    private int value;
    private static Map map = new HashMap<>();

    Rank(int value, String label) {
        this.value = value;
        this.label = label;
    }

    static {
        for (Rank pageType : Rank.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static Rank valueOf(int pageType) {
        return (Rank) map.get(pageType);
    }

    public int getValue() {
        return value;
    }

    public String getLabel () {
        return label;
    }
}