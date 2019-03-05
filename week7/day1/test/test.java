
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.applet.Main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static org.junit.Assert.*;

public class test {

    @Test
    public void exists(){
        Path pokerFile = Paths.get("./src/Poker.java");
        assertTrue(Files.exists(pokerFile));
    }
    @Test
    public void testHighestCard(){
        assertEquals("White wins! Highest Card A",Poker.returnHighestCard("2H 3D 5S 9C KD","2C 3H 4S 8C AH"));
    }
    @Test
    public void testValues(){
        assertEquals((Integer) 6,Poker.createMap().get("6") );
    }


}
