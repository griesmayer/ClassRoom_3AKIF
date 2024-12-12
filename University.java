public class University
{
    private ClassRoom room0;
    private ClassRoom room1;
    private ClassRoom room2;
    
    public void add(ClassRoom newClassRoom)
    {
        if (newClassRoom != null)
        {
            if (newClassRoom.getUniversity() == null)
            {
                if (room0 == null)
                {
                    room0 = newClassRoom;
                    newClassRoom.setUniversity(this);
                }
                else
                {
                    if (room1 == null)
                    {
                        room1 = newClassRoom;
                        newClassRoom.setUniversity(this);
                    }
                    else
                    {
                        if (room2 == null)
                        {
                            room2 = newClassRoom;
                            newClassRoom.setUniversity(this);
                        }
                        else
                        {
                            System.out.println("Error: no more space!");
                        }
                    }
                }
            }
            else
            {
                System.out.println("Error: already in another university!");
            }
        }
        else
        {
            System.out.println("Error: no classroom!");
        }
    }
    
    public void remove(ClassRoom classRoom)
    {
        if (classRoom != null)
        {
            if (room0 == classRoom)
            {
                room0 = null;
                classRoom.setUniversity(null);
            }
            else
            {
                if (room1 == classRoom)
                {
                    room1 = null;
                    classRoom.setUniversity(null);
                }
                else
                {
                    if (room2 == classRoom)
                    {
                        room2 = null;
                        classRoom.setUniversity(null);
                    }
                    else
                    {
                        System.out.println("Error: the room is not in our university!");
                    }
                }
            }
        }
        else
        {
            System.out.println("Error: not a valid class room!");
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

    public ClassRoom biggestClassRoom()
    {
        int max;
        ClassRoom classRoom;
        
        max = -999;
        classRoom = null;
        if (room0 != null)
        {
            if (room0.getSize() > max)
            {
                max = room0.getSize();
                classRoom = room0;
            }
        }
        if (room1 != null)
        {
            if (room1.getSize() > max)
            {
                max = room1.getSize();
                classRoom = room1;
            }            
        }
        if (room2 != null)
        {
            if (room2.getSize() > max)
            {
                max = room2.getSize();
                classRoom = room2;
            }
        }
        return classRoom;
    }

    
    // public int biggestClassRoom()
    // {
        // int max;
        
        // max = -999;
        // if (room0 != null)
        // {
            // if (room0.getSize() > max)
            // {
                // max = room0.getSize();
            // }
        // }
        // if (room1 != null)
        // {
            // if (room1.getSize() > max)
            // {
                // max = room1.getSize();
            // }
        // }
        // if (room2 != null)
        // {
            // if (room2.getSize() > max)
            // {
                // max = room2.getSize();
            // }
        // }
        
        // return max;
    // }
    
    public int minSizeComputerRoom()
    {
        return 0;
    }
}

















