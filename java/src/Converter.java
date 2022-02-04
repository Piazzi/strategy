public class Converter {

    private String text;

    public Converter(String convertTo) {
        this.text = convertTo;
    }

    public String convert(Convert convert) {
        return convert.convertText(text);
    }
}
