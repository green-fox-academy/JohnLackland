import Fibonachi.Fibonacchi;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonachiTest {

    @Test
    public void fibonacchi_IsItTheRightNumber(){
        Fibonacchi theNumber = new Fibonacchi();
        assertEquals(0,theNumber.xThFibonachiNumber(0));
    }
}
