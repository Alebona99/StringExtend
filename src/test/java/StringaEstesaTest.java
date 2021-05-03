import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringaEstesaTest {

    @Test
    void isEmpty() {
    }

    @Test
    void isBlank() {
    }

    @Test
    void isNumeric_number_space() {
        StringaEstesa str = new StringaEstesa("1 2");
        Assertions.assertFalse(str.isNumeric());
    }


    @Test
    void isEmpty_null() {
        StringaEstesa string = new StringaEstesa();
        Assertions.assertTrue(string.isEmpty());
        //StringUtils.isEmpty(string.getValue());
        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    @Test
    void isEmpty_with_value(){
        StringaEstesa string = new StringaEstesa("he");
        Assertions.assertTrue(string.isEmpty());

        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    @Test
    void isBlank_spazi() {
        StringaEstesa string = new StringaEstesa(" ");
        Assertions.assertTrue(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    @Test
    void isBlank_with_value() {
        StringaEstesa string = new StringaEstesa("giuu");
        Assertions.assertTrue(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    @Test
    void isBlank_initial_spazi() {
        StringaEstesa string = new StringaEstesa(" hhhi");
        Assertions.assertTrue(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    @Test
    void isNUmeric_with_space() {
        StringaEstesa string = new StringaEstesa("1 2 3");
        Assertions.assertFalse(string.isNumeric());

        Assertions.assertEquals( string.isNumeric(), StringUtils.isNumeric(string.getValue()) );
    }


    @Test
    void isNumeric_only_numbers(){
        StringaEstesa string = new StringaEstesa("133");
        Assertions.assertTrue(string.isNumeric());

        Assertions.assertEquals( string.isNumeric(), StringUtils.isNumeric(string.getValue()) );
    }

    @Test
    void isNumeric_letters(){
        StringaEstesa string = new StringaEstesa("abv");
        Assertions.assertFalse(string.isNumeric());

        Assertions.assertEquals( string.isNumeric(), StringUtils.isNumeric(string.getValue()));
    }

}