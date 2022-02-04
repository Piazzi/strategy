public class ConvertToHTML implements Convert {

    public String convertText(String text) {
        return "<p>" + text +"</p>";
    }

}
