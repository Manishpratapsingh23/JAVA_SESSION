//package inhertance;

public class RoomUse {
    public static void main(String[] args) {
        BedRoom br = new BedRoom(10, 20, 30);
        int area = br.area();
        System.out.println("area of room is "+area);

        int volume = br.volume();
        System.out.println("volume of room is "+volume);


        System.out.println("room ka rent kya h" + br.rent);

        br.roomDetails();
        //br.display();
    }
}
