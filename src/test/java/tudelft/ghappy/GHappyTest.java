package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private   GHappy gHappy;

    @BeforeEach
    public void getinitialized()
    {
         gHappy=new GHappy();
    }

    @Test
    public void gHappy()
    {

        Assertions.assertTrue(gHappy.gHappy("ggxxggxx"));
    }

    @Test
    public void gHappy1()
    {

        Assertions.assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void gHappy2()
    {

        Assertions.assertFalse(gHappy.gHappy("xxggyygxx"));
    }

}
