package domain;


public class Temperature {

    private static int tempValue;
    public static final int MAXVALUE=50;
    public static final int MINVALUE =0;

    public Temperature(int value) {
        Temperature.tempValue = value;
    }

    public int getTemperature() {
        return tempValue;
    }

    public void setTemperature(int value) {
        tempValue = value;
    }


    public static int getValue() {
        return tempValue;
    }

    public static void setValue(int value) {
        tempValue = value;
    }
}
