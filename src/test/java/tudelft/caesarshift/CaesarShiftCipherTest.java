package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    CaesarShiftCipher caesarShiftCipher;
    @BeforeEach
    public void initialized()
    {
         caesarShiftCipher=new CaesarShiftCipher();
    }
    @Test
    public void encryptMessage()
    {
        Assertions.assertEquals("a bc",caesarShiftCipher.CaesarShiftCipher("x yz",3));
    }

}
