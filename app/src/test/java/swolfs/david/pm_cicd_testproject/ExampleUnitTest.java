package swolfs.david.pm_cicd_testproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void add_isCorrect() throws Exception {
        assertEquals(4, Utils.addNumbers(2 , 2));
    }

    @Test
    public void add_twodigits_isCorrect() throws Exception {
        assertEquals(44, Utils.addNumbers(22 , 22));
    }

    @Test
    public void add_big_isCorrect() throws Exception {
        assertEquals(4444, Utils.addNumbers(2222 , 2222));
    }

    //substract haha
    @Test
    public void sub_isCorrect() throws Exception {
        assertEquals(0,Utils.subNumbers(2,2));
    }

    @Test
    public void sub_twodigits_isCorrect() throws Exception{
        assertEquals(44, Utils.subNumbers(88,44));
    }

    @Test
    public void sub_big_isCorrect() throws Exception{
        assertEquals(10000,Utils.subNumbers(15000,5000));
    }
}