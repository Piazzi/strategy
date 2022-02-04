import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldReturnTextInUpperCase() {
        User user = new User();
        user.upperCaseText("Fancy Text");
        assertEquals("FANCY TEXT", user.getText());
    }

    @Test
    void shouldReturnLowerCaseText() {
        User user = new User();
        user.lowerCaseText("Fancy Text");
        assertEquals("fancy text", user.getText());
    }

    @Test
    void shouldReturnTextWithinHTML() {
        User user = new User();
        user.htmlText("Fancy Text");
        assertEquals("<p>Fancy Text</p>", user.getText());
    }

}