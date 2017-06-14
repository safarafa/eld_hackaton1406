package domain;


public class Temperature {

    private static int tempValue;
    private String tempType;
    public static final int maxvalue=50;
    public static final int minvalue =0;

    public Temperature(int value, String type) {
        this.tempValue = value;
        this.tempType = type;

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
        return tempValue;
    }

    public static void setValue(int value) {
        Temperature.tempValue = value;
    }

    public String getType() {
        return tempType;
    }

    public void setType(String type) {
        this.tempType = type;
    }
}
