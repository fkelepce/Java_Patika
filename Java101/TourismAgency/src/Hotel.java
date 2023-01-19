import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}