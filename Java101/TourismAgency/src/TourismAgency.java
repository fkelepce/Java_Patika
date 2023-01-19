import java.util.*;

public class TourismAgency {

    private Map<String, Hotel> hotels;
    private Map<String, Room> rooms;

    public TourismAgency() {
        hotels = new HashMap<>();
        rooms = new HashMap<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.put(hotel.getName(), hotel);
    }

    public void addRoom(String roomId, Room room) {
        rooms.put(roomId, room);
    }

    public Room searchRoom(String roomId) {
        return rooms.get(roomId);
    }

    public double getPrice(String roomId) {
        Room room = rooms.get(roomId);
        if (room != null) {
            return room.getPrice();
        }
        return -1;
    }

    public void updatePrice(String roomId, double newPrice) {
        Room room = rooms.get(roomId);
        if (room != null) {
            room.setPrice(newPrice);
        }
    }

    public List<Hotel> searchHotel(String name) {
        List<Hotel> result = new ArrayList<>();
        for (Hotel hotel : hotels.values()) {
            if (hotel.getName().contains(name)) {
                result.add(hotel);
            }
        }
        return result;
    }

    public List<Room> getRooms(String hotelName) {
        Hotel hotel = hotels.get(hotelName);
        if (hotel != null) {
            return hotel.getRooms();
        }
        return new ArrayList<>();
    }

    public Room getAvailableRoom(String hotelName, int capacity) {
        List<Room> rooms = getRooms(hotelName);
        for (Room room : rooms) {
            if (room.getCapacity() == capacity && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }
}