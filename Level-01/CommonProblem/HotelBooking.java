public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Default Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public boolean isDefaultBooking() {
        return "Default Guest".equals(guestName) && "Standard".equals(roomType) && nights == 1;
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking: " + defaultBooking.guestName + ", " + defaultBooking.roomType + ", " + defaultBooking.nights);

        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Custom Booking: " + customBooking.guestName + ", " + customBooking.roomType + ", " + customBooking.nights);

        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking: " + copiedBooking.guestName + ", " + copiedBooking.roomType + ", " + copiedBooking.nights);

        System.out.println("Is Default Booking (defaultBooking): " + defaultBooking.isDefaultBooking());
        System.out.println("Is Default Booking (copiedBooking): " + copiedBooking.isDefaultBooking());
    }
}
