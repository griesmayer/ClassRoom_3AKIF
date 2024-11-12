public class TestClassRoom_ObjectReference
{
    public void test1()
    {
        ClassRoom r1;
        ClassRoom r2;
        ClassRoom r3;
        
        r1 = new ClassRoom("B3.17", true, 25);
        r2 = r1;
        r3 = new ClassRoom("B3.17", true, 25);
    }
    
    
    public void test2()
    {
        ClassRoom r1, r2, r3, a, b, c, d, e;
        
        r1 = new ClassRoom("B3.17", true,  25);
        r3 = new ClassRoom("B3.17", true,  25);
        a = new ClassRoom("B4.10",  true,  15);
        b = r1;
        b.setSize(19);
        e = new ClassRoom("B2.09",  false, 35);
        e = b;
        b = null;
        c = new ClassRoom("B1.18",  false, 20);
        r3 = c;
        a = new ClassRoom("B2.22",  false, 10);
        e = a;
        b = new ClassRoom("B3.33",  true,  18);
        r3.setSize(18);
        r1.printClassRoom();
        //r2.printClassRoom();
        r3.printClassRoom();
        a.printClassRoom();
        b.printClassRoom();
        c.printClassRoom();
        //d.printClassRoom();
        e.printClassRoom();
    }
}
