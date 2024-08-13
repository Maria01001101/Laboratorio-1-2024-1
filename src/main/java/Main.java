// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
    private CinemaRoom cinemaRoom;
    private Movie movie;
    private CashRegister cashRegister;

    public Main() {
        this.cinemaRoom = new CinemaRoom();
        this.movie = new Movie("Inception", "Christopher Nolan", "Sci-Fi", 148);
        this.cashRegister = new CashRegister();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isOpen = true;

        while (isOpen) {
            System.out.println("*******************Boletería*********************");
            System.out.println("1. Vender boletos");
            System.out.println("2. Devolver entrada");
            System.out.println("3. Ver disponibilidad de espacios");
            System.out.println("4. Ver información de la película");
            System.out.println("5. Cerrar boletería");
            System.out.println("6. Ver total recaudado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    sellTickets(scanner);
                    break;
                case 2:
                    returnTickets(scanner);
                    break;
                case 3:
                    showAvailability();
                    break;
                case 4:
                    showMovieInfo();
                    break;
                case 5:
                    closeMain();
                    break;
                case 6:
                    showTotalCollected();
                    break;
                case 7:
                    isOpen = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    private void sellTickets(Scanner scanner) {
        System.out.print("Ingrese la cantidad de boletos a comprar: ");
        int tickets = scanner.nextInt();
        if (tickets <= cinemaRoom.getAvailableSeats()) {
            cinemaRoom.setOccupiedSeats(cinemaRoom.getOccupiedSeats() + tickets);
            double total = tickets * 10.0;  // Precio fijo de 10.0 por entrada
            cashRegister.addToAmountCollected(total);
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("No hay suficientes asientos disponibles.");
        }
    }

    private void returnTickets(Scanner scanner) {
        System.out.print("Ingrese la cantidad de boletos a devolver: ");
        int tickets = scanner.nextInt();
        if (tickets <= cinemaRoom.getOccupiedSeats()) {
            cinemaRoom.reduceOccupiedSeats(tickets);
            double refund = tickets * 10.0;  // Precio fijo de 10.0 por entrada
            cashRegister.setAmountCollected(cashRegister.getAmountCollected() - refund);
            System.out.println("Monto a reembolsar: $" + refund);
        } else {
            System.out.println("No se pueden devolver más boletos de los que se han vendido.");
        }
    }

    private void showAvailability() {
        System.out.println("Asientos disponibles: " + cinemaRoom.getAvailableSeats());
    }

    private void showMovieInfo() {
        System.out.println(movie.toString());
    }

    private void closeMain() {
        System.out.println("Boletería cerrada. No se pueden vender ni devolver boletos.");
    }

    private void showTotalCollected() {
        System.out.println("Total recaudado: $" + cashRegister.getAmountCollected());
    }

    public static void main(String[] args) {
        Main Main = new Main();
        Main.start();
    }
}
