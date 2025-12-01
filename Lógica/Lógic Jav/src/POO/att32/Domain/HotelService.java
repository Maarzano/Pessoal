package att32.Domain;

public class HotelService {
    public void reservarQuarto(String hotel, String periodo) {
        if (hotel.equalsIgnoreCase("Hotel California")) {
            throw new RuntimeException("Hotel sem vagas!");
        }
        System.out.println("🏨 Quarto reservado no " + hotel + " para " + periodo);
    }
    public void cancelarReserva(String hotel) {
        System.out.println("✖️ Reserva no " + hotel + " cancelada.");
        throw new RuntimeException("Erro na reserva do quarto");
    }
}