import Anagram.Anagram;
import apple.Apples;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sum.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class FirstThreeExerciseTest {

    @Test
    public void getApple_Test(){
        Apples apple = new Apples();

        assertEquals("Apple",apple.getApple() );
    }




    @Test
    public void sum_isItEmpty_Test(){
        ArrayList<Integer> something = new ArrayList<>();
        Sum number = new Sum();
        assertEquals(0,number.sum(something));
    }
    @Test
    public void sum_oneElement_Test(){
        ArrayList<Integer> something = new ArrayList<>();
        Sum number = new Sum();
        something.add(((Integer)3));
        assertEquals(1,number.sum(something));
    }
    @Test
    public void sum_MultipleElements_Test(){
        ArrayList<Integer> something = new ArrayList<>();
        Sum number = new Sum();
        assertEquals(999,number.sum(something));
    }
    @Test
    public void sum_Null_Test(){
        ArrayList<Integer> something = null;
        Sum number = new Sum();
        assertNull(something);
    }

    @Test
    public void IsItAnagramm_Test(){
         Anagram anagram = new Anagram();
         assertTrue(anagram.isItAnagramm("haha","haha"));
    }
}
