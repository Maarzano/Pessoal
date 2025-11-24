package att26.repository;

import java.util.HashMap;
import java.util.Map;

import att26.contracts.ITicketRepository;
import att26.models.Ticket;

public class MemoriaTicketRepository implements ITicketRepository {
    private Map<String, Ticket> bancoDeDados = new HashMap<>();

    @Override
    public void salvar(Ticket ticket) {
        bancoDeDados.put(ticket.getPlacaVeiculo(), ticket);
        System.out.println("[DB] Ticket salvo no banco para a placa: " + ticket.getPlacaVeiculo());
    }

    @Override
    public Ticket buscarPorPlaca(String placa) {
        return bancoDeDados.get(placa);
    }
    
    @Override
    public void atualizar(Ticket ticket) {
        bancoDeDados.put(ticket.getPlacaVeiculo(), ticket);
    }
}