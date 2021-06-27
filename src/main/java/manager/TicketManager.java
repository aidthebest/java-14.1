package manager;

import domain.Ticket;
import repository.TicketRepository;

public class TicketManager {
    private TicketRepository repository = new TicketRepository();

    public void add(Ticket item) {
        repository.save(item);
    }

    public Ticket[] getAll() {
        return repository.findAll();
    }

    public void removeById(int id) {
        repository.removeById(id);
    }
}
