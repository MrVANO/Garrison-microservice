package garrisonms.entity.warriors;

public enum  WarriorType {
    ARCHER("archer"),
    KNIGHT("knight"),
    WIZARD("wizard");


    private String value;

    WarriorType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}