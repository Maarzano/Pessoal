package att32.Domain;

public class VooService {
    public void reservarAssento(String voo, String passageiro) {
        System.out.println("✈️ Voo " + voo + " reservado para " + passageiro);
    }
    public void cancelarReserva(String voo) {
        System.out.println("✖️ Voo " + voo + " cancelado com sucesso.");
        throw new RuntimeException("Erro na reserva do assento do avião");
    }
}