package repository;

import domain.Ticket;

import java.util.Arrays;

public class TicketRepository {
    private Ticket[] items = new Ticket[0];

    public TicketRepository(Ticket[] items) {
        this.items = items;
    }

    public TicketRepository() {

    }

    public void save(Ticket item) {
        int length = items.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] tmp = new Ticket[items.length];
        int index = 0;
        for (Ticket item : items) {
            if (item.getFrom() == from && item.getTo() == to) {
                tmp[index] = item;
                index++;
            }
        }
        Ticket[] returnItems = new Ticket[index];
        System.arraycopy(tmp, 0, returnItems, 0, index);
        Arrays.sort(returnItems);
        return returnItems;
    }


    public void removeById(int id) {
        int length = items.length - 1;
        Ticket[] tmp = new Ticket[length];
        int index = 0;
        for (Ticket item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public Ticket findById(int id) {
        for (Ticket item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}

