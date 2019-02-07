import lettercounter.LetterCounter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;



public class LetterCounterTest {

   @Test
    public void LetterCounter_Test(){
       LetterCounter something = new LetterCounter();
       //HashMap<Character, Integer>  anything = something.letterCounterr("hello");
       assertEquals(2, something.letterCounterr("hello").get('l'));

   }

}
