public class Room {
    private int roomNumber;
    private int capacity;
    private double price;
    private boolean available;

    public Room(int roomNumber, int capacity, double price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price = price;
        available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }
}
