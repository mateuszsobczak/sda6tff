import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest {
    private CalcService calcService;

    @Before
    public void init() {
        calcService = new CalcService();
    }

    @Test
    public void shouldAddDigitsInStringAndProduceResult() {
        //given
        String input = "2;3;4";
        int expected = 9;
        //when
        int actual = calcService.calculate(input);
        //then
        Assert.assertEquals(expected, actual);

    }
}
