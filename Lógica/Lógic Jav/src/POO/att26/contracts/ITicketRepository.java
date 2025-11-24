package att26.contracts;

import att26.models.Ticket;

public interface ITicketRepository {
    void salvar(Ticket ticket);
    Ticket buscarPorPlaca(String placa);
    void atualizar(Ticket ticket);
}
