package manager;

import domain.Ticket;
import repository.TicketRepository;

public class TicketManager {
    private TicketRepository repository = new TicketRepository();

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public TicketManager() {
    }

    public void add(Ticket item) {
        repository.save(item);
    }

    public Ticket[] getAll(String from, String to) {
        return repository.findAll(from, to);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }
}
