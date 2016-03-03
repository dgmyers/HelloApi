package ca.dgmyers;

import ca.dgmyers.DoStuff;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by dgmyers on 2/28/2016.
 */
public class TestMe {

    private DoStuff stuff;

    @BeforeClass
    public void setup(){
        stuff = new DoStuff();
    }

    @Test
    public void itsATest(){
        assert (1==1);
    }

    @Test
    public void testDoStuff() throws Exception {
        assert (stuff.giveMeOne() == 1);
        assert (stuff.addOne(1) == 2);

    }
}
