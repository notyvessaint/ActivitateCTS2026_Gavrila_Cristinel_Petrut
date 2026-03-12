//Started in Seminar 4
package ro.ase.cts.main;

public class Main {
    public static void main(String[] args) {
        try {
            Hotel hotel = Hotel.getInstance("Nume", 7, 5);
            Hotel megaHotel = Hotel.getInstance("MegaHotel", 200, 0);

            hotel.rezervaCamera();
            hotel.rezervaCamera();

            megaHotel.rezervaCamera();
            megaHotel.rezervaCamera();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
