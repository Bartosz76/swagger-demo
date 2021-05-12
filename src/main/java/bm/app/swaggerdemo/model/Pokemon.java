package bm.app.swaggerdemo.model;

public class Pokemon {

    private String name;
    private String type;
    private int powerLevel;

    public Pokemon(String name, String type, int powerLevel) {
        this.name = name;
        this.type = type;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
}
