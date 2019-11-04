import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Hamza Ouni
 */
public class ListTest {

    private List<String> list  = new ArrayList<>();

    @Test
    public void testAdd() {
        list.add("Foo");
        assertEquals(1,list.size());
    }

    @Test
    public void testAdd2() {
        list.add("Foo");
        list.add("Foo2");
        assertEquals(2,list.size());
    }

    //*****************************************************************

    @Test
    public void oldSchoolApproach() {

        try {
            Integer.parseInt("foo");
            fail("NumberFormatException Expected");
        } catch (NumberFormatException expected) {
            assertEquals("For input string: \"foo\"",expected.getMessage());
        }

    }


    @Test(expected = NumberFormatException.class)
    public void annotationParameterApproach() { Integer.parseInt("foo"); }


    //*****************************************************************


    @org.junit.jupiter.api.Test
    public void newApproach() {
        NumberFormatException exception= assertThrows(NumberFormatException.class, () ->{
            Integer.parseInt("42");
        } );

        assertEquals("For input string: \"foo\"",exception.getMessage());
    }
}
