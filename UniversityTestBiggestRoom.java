

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UniversityTestBiggestRoom
{
    @Test
    public void testEmpty()
    {
        University uni;
        
        uni = new University();
        assertEquals (uni.biggestClassRoom(), null);
    }
    
    @Test
    public void test1()
    {
        University uni;
        ClassRoom r0;
        
        uni = new University();
        r0 = new ClassRoom("B1.11", false, 20);
        uni.add(r0);
        assertEquals (uni.biggestClassRoom(), r0);
    }

    @Test
    public void test2()
    {
        University uni;
        ClassRoom r0, r1;
        
        uni = new University();
        r0 = new ClassRoom("B1.11", false, 20);
        r1 = new ClassRoom("C2.22", false, 25);
        uni.add(r0);
        uni.add(r1);
        assertEquals (uni.biggestClassRoom(), r1);
    }

    @Test
    public void test3()
    {
        University uni;
        ClassRoom r0, r1, r2;
        
        uni = new University();
        r0 = new ClassRoom("B1.11", false, 20);
        r1 = new ClassRoom("C2.22", false, 25);
        r2 = new ClassRoom("D3.33", false, 30);
        uni.add(r0);
        uni.add(r1);
        uni.add(r2);
        assertEquals (uni.biggestClassRoom(), r2);
    }

    @Test
    public void testM()
    {
        University uni;
        ClassRoom r0, r1, r2;
        
        uni = new University();
        r0 = new ClassRoom("B1.11", false, 20);
        r1 = new ClassRoom("C2.22", false, 28);
        r2 = new ClassRoom("D3.33", false, 25);
        uni.add(r0);
        uni.add(r1);
        uni.add(r2);
        assertEquals (uni.biggestClassRoom(), r1);
    }

    @Test
    public void testF()
    {
        University uni;
        ClassRoom r0, r1, r2;
        
        uni = new University();
        r0 = new ClassRoom("B1.11", false, 29);
        r1 = new ClassRoom("C2.22", false, 28);
        r2 = new ClassRoom("D3.33", false, 25);
        uni.add(r0);
        uni.add(r1);
        uni.add(r2);
        assertEquals (uni.biggestClassRoom(), r0);
    }





}
