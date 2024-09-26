public class ClassRoom
{
    private String  roomNr;
    private boolean computer;
    private int     size;
    private boolean beamer;
    private boolean windows;
    
    public void setRoomNr(String newRoomNr)
    {
        roomNr = newRoomNr;
    }
    
    public void setComputer(boolean newComputer)
    {
        computer = newComputer;
    }
    
    public void setSize(int newSize)
    {
        size = newSize;
    }
    
    public String getRoomNr()
    {
        return roomNr;
    }
    
    public boolean getComputer()
    {
        return computer;
    }
    
    public int getSize()
    {
        return size;
    }    
}
