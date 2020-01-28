package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    Mirror mirror;

    @BeforeEach
    public void Initialization()
    {
        mirror=new Mirror();
    }

    @Test
    public void MirrorImageTest()
    {
        Assertions.assertEquals("aba",mirror.mirrorEnds("aba"));
    }

    @Test
    public void NullMirrorImageTest()
    {
        Assertions.assertEquals(null,mirror.mirrorEnds(null));
    }

}
