import apple.Apples;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FirstThreeExerciseTest {

    @Test
    public void getApple_Test(){
        Apples apple = new Apples();

        assertEquals("Apple",apple.getApple() );
    }
}
