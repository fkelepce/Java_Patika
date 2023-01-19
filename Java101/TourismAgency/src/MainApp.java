import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        TourismAgency agency = new TourismAgency();

        Hotel hotel1 = new Hotel("Grand Hotel", "New York");
        Room room1 = new Room(101, 2, 200.0);
        Room room2 = new Room(102, 3, 250.0);
        Room room3 = new Room(103, 4, 300.0);
        hotel1.addRoom(room1);
        hotel1.addRoom(room2);
        hotel1.addRoom(room3);
        agency.addHotel(hotel1);

        Hotel hotel2 = new Hotel("Elegant Hotel", "Paris");
        Room room4 = new Room(201, 2, 400.0);
        Room room5 = new Room(202, 3, 450.0);
        Room room6 = new Room(203, 4, 500.0);
        hotel2.addRoom(room4);
        hotel2.addRoom(room5);
        hotel2.addRoom(room6);
        agency.addHotel(hotel2);

        //search for hotel by name
        List<Hotel> searchResult = agency.searchHotel("Grand");
        for (Hotel hotel : searchResult) {
            System.out.println("Hotel Name: " + hotel.getName() + " Location: " + hotel.getLocation());
        }

        //search for room by id
        Room searchRoom = agency.searchRoom("GRAND_101");
        if(searchRoom != null){
            System.out.println("Room Number: " + searchRoom.getRoomNumber() + " Room Capacity: " + searchRoom.getCapacity());
        }

        //get room price
        double roomPrice = agency.getPrice("GRAND_101");
        System.out.println("Price of the room: " + roomPrice);

        //update room price
        agency.updatePrice("GRAND_101", 250.0);
        System.out.println("New Price of the room: " + agency.getPrice("GRAND_101"));

        //check room availability
        Room availableRoom = agency.getAvailableRoom("Grand Hotel", 3);
        if (availableRoom != null) {
            System.out.println("Room number " + availableRoom.getRoomNumber() + " is available with capacity " + availableRoom.getCapacity());
        } else {
            System.out.println("No available room found with the given capacity");
        }

        //set room availability
        availableRoom.setAvailability(false);
        availableRoom = agency.getAvailableRoom("Grand Hotel", 3);
        if (availableRoom != null) {
            System.out.println("Room number " + availableRoom.getRoomNumber() + " is available with capacity " + availableRoom.getCapacity());
        } else {
            System.out.println("No available room found with the given capacity");
        }
    }
}