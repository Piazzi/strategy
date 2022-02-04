import java.util.Locale;

public class ConvertToUpperCase implements Convert {

    public String convertText(String text) {
        return text.toUpperCase(Locale.ROOT);
    }
}
