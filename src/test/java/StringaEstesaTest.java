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

    /**
     * Test case isEmpty 1
     */
    @Test
    void isEmpty_null() {
        StringaEstesa string = new StringaEstesa();
        Assertions.assertTrue(string.isEmpty());
        //StringUtils.isEmpty(string.getValue());
        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    /**
     * Test case isEmpty 2
     */
    @Test
    void isEmpty_with_value(){
        StringaEstesa string = new StringaEstesa("he");
        Assertions.assertFalse(string.isEmpty());

        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    /**
     * Test case isEmpty 3
     */
    @Test
    void isEmpty_with_numbers(){
        StringaEstesa string = new StringaEstesa("1 2 3");
        Assertions.assertFalse(string.isEmpty());

        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    /**
     * Test case isEmpty 4
     */
    @Test
    void isEmpty_spaces(){
        StringaEstesa str = new StringaEstesa(" ");
        Assertions.assertFalse(str.isEmpty());
        Assertions.assertEquals(str.isEmpty(), StringUtils.isEmpty(str.getValue()));
    }

    /**
     * Test case isBlank 1
     */
    @Test
    void isBlank_spazi() {
        StringaEstesa string = new StringaEstesa(" ");
        Assertions.assertTrue(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }


    /**
     * Test case isBlank 2
     */
    @Test
    void isBlank_with_value() {
        StringaEstesa string = new StringaEstesa("giuu");
        Assertions.assertFalse(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    /**
     * Test case isBlank 3
     */
    @Test
    void isBlank_initial_spazi() {
        StringaEstesa string = new StringaEstesa(" hhhi");
        Assertions.assertFalse(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    /**
     * Test case isBlank 4
     */
    @Test
    void isBlank_letters(){
        StringaEstesa str = new StringaEstesa("abc");
        Assertions.assertFalse(str.isBlank());

        Assertions.assertEquals(str.isBlank(), StringUtils.isBlank(str.getValue()));
    }

    /**
     * Test case isNumeric 1
     */
    @Test
    void isNumeric_number_blank() {
        StringaEstesa str = new StringaEstesa("");
        Assertions.assertFalse(str.isNumeric());

        Assertions.assertEquals(str.isNumeric(), StringUtils.isNumeric(str.getValue()));
    }

    /**
     * Test case isNumeric 2
     */
    @Test
    void isNUmeric_with_space() {
        StringaEstesa string = new StringaEstesa("1 2 3");
        Assertions.assertFalse(string.isNumeric());

        Assertions.assertEquals( string.isNumeric(), StringUtils.isNumeric(string.getValue()) );
    }


    /**
     * Test case isNumeric 3
     */
    @Test
    void isNumeric_only_numbers(){
        StringaEstesa string = new StringaEstesa("133");
        Assertions.assertTrue(string.isNumeric());

        Assertions.assertEquals( string.isNumeric(), StringUtils.isNumeric(string.getValue()) );
    }


    /**
     * Test case isNumeric 4
     */
    @Test
    void isNumeric_letters(){
        StringaEstesa string = new StringaEstesa("abv");
        Assertions.assertFalse(string.isNumeric());

        Assertions.assertEquals( string.isNumeric(), StringUtils.isNumeric(string.getValue()));
    }

}