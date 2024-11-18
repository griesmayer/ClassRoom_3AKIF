public class University
{
    private ClassRoom room0;
    private ClassRoom room1;
    private ClassRoom room2;
    
    public void add(ClassRoom newClassRoom)
    {
        if (room0 == null)
        {
            room0 = newClassRoom;
        }
        else
        {
            if (room1 == null)
            {
                room1 = newClassRoom;
            }
            else
            {
                if (room2 == null)
                {
                    room2 = newClassRoom;
                }
                else
                {
                    System.out.println("Error: no more space!");
                }
            }
        }
    }
    
    public void printUniversity()
    {
        if (room0 != null)
        {
            room0.printClassRoom();
        }
        if (room1 != null)
        {
            room1.printClassRoom();
        }
        if (room2 != null)
        {
            room2.printClassRoom();
        }
    }
    
    public int biggestClassRoom()
    {
        int max;
        
        max = -999;
        if (room0 != null)
        {
            if (room0.getSize() > max)
            {
                max = room0.getSize();
            }
        }
        if (room1 != null)
        {
            if (room1.getSize() > max)
            {
                max = room1.getSize();
            }
        }
        if (room2 != null)
        {
            if (room2.getSize() > max)
            {
                max = room2.getSize();
            }
        }
        
        return max;
    }
    
    public int minSizeComputerRoom()
    {
        return 0;
    }
}

















