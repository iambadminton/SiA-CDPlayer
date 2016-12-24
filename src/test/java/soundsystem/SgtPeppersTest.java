package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Sanya on 18.12.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SgtPeppers.class)
public class SgtPeppersTest {

    @Autowired
    private SgtPeppers sgt;

    @Test
    public void titleSHouldNotBeNull() {
        assertNotNull(sgt);
    }


}