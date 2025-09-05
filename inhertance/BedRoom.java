//package inhertance;

public class BedRoom extends Room {
    int height;
    public BedRoom(int x, int y, int z){
        super(x, y);
        height = z;
        //rent = 8000;
    }
    // area() is ka method h isne inherit kiya h
    int volume(){
        return length*breadth*height;
    }
}
