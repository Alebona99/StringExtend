import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringaEstesaTest {

    @Test
    void isEmpty() {
        StringaEstesa string = new StringaEstesa();
        Assertions.assertTrue(string.isEmpty());
        //StringUtils.isEmpty(string.getValue());
        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    @Test
    void isBlank() {
        StringaEstesa string = new StringaEstesa(" ");
        Assertions.assertTrue(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    @Test
    void isNUmeric() {
        StringaEstesa string = new StringaEstesa("123");
        Assertions.assertTrue(string.isNUmeric());

        Assertions.assertEquals( string.isNUmeric(), StringUtils.isNumeric(string.getValue()) );
    }
}