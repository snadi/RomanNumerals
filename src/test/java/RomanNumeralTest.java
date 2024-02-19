import org.junit.jupiter.api.Test;

/**
 * Created by snadi on 2019-01-30.
 */
public class RomanNumeralTest {

    @Test
    public void testConvert1Char(){
        assert(RomanNumeral.convert("I") == 1);
    }

    @Test
    public void testConvert3Char(){
        assert(RomanNumeral.convert("III") == 3);
    }

    @Test
      public void testConvertStartWithV(){
        assert(RomanNumeral.convert("VI") == 6);
    }


}
