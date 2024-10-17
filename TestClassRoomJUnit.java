

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClassRoomJUnit
{
    @Test
    public void testSmall()
    {
        ClassRoom room1;
        
        room1 = new ClassRoom("B.5.10", false, 9);
        // Error
        assertEquals (room1.getSize(), 25);
    }
    
    @Test    
    public void testBig()
    {
        ClassRoom room2;
        
        room2 = new ClassRoom("C.2.10", true, 41);
        // Error
        assertEquals (room2.getSize(), 25);
    }
    
    @Test   
    public void testOK()
    {
        ClassRoom room3;
        
        room3 = new ClassRoom("D.4.11", false, 20);
        assertEquals (room3.getSize(), 20);
    }

}
