package cors;


public class Cors {

    private final long value;
    private final String temperature_format;

    public Cors() {
        this.value = -1;
        this.temperature_format = "C";  //Celcjusza
    }

    public Cors(long value, String temperature_format) {
        this.value = value;
        this.temperature_format = temperature_format;
    }

    public long getValue() {
        return value;
    }

    public String getTemperature_format() {
        return temperature_format;
    }
}
