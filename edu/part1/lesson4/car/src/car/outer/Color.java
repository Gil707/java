package car.outer;

/**
 * Created by Gil on 31-Oct-16.
 */
public class Color {

    public Color(int value, TYPE type) {
        this.value = value;
        this.type = type;
    }

    public enum TYPE{
            METALLIC,
            NO_METALLIC;
    }

    private final int value;
    private TYPE type;


}
