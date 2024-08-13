public class CinemaRoom {
    /*Declaración de Atributos*/
    private int capacity;
    private int occupiedSeats;

    /*Constructor sin Parámetros*/
    public CinemaRoom() {
        this.capacity = 60;
        this.occupiedSeats = 0;
    }

    public CinemaRoom(int capacity, int occupiedSeats) {
        this.capacity = capacity;
        this.occupiedSeats = occupiedSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }

    public int getAvailableSeats() {
        return capacity - occupiedSeats;
    }

    public void reduceOccupiedSeats(int seats) {
        if (occupiedSeats >= seats) {
            this.occupiedSeats -= seats;
        }
    }
}