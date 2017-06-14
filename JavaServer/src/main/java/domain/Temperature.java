package domain;


public class Temperature {

    private static int value;
    private String type;
    public static final int maxvalue=50;
    public static final int minvalue =0;

    public Temperature(int value, String type) {
        this.value = value;
        this.type = type;

    }

    public Temperature() {
    }

    public void increase(){

    }

    public static int getMinvalue() {
        return minvalue;
    }

    public static int getMaxvalue() {
        return maxvalue;
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Temperature.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
