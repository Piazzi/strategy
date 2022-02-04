public class User {

    private String text;

    public String getText() {
        return text;
    }

    public void upperCaseText(String text) {
        Converter converter = new Converter(text);
        this.text = converter.convert(new ConvertToUpperCase());
    }

    public void lowerCaseText(String text) {
        Converter converter = new Converter(text);
        this.text = converter.convert(new ConvertToLowerCase());
    }

    public void htmlText(String text) {
        Converter converter = new Converter(text);
        this.text = converter.convert(new ConvertToHTML());
    }

}
