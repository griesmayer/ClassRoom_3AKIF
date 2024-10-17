public class TestClassRoomSemi
{
    public void testSmall()
    {
        ClassRoom room1;
        
        room1 = new ClassRoom("B.5.10", false, 9);
        // Error
        System.out.println(room1.getSize());
        // 25
    }
    
    public void testBig()
    {
        ClassRoom room2;
        
        room2 = new ClassRoom("C.2.10", true, 41);
        // Error
        System.out.println(room2.getSize());
        // 25
    }
    
    public void testOK()
    {
        ClassRoom room3;
        
        room3 = new ClassRoom("D.4.11", false, 20);
        System.out.println(room3.getSize());
        // 20
    }
}
