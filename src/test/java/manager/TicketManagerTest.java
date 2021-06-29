package manager;

import domain.Ticket;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    private TicketManager manager = new TicketManager();

    private Ticket first = new Ticket(1, 1_000, "VKO","AER", 350);
    private Ticket second = new Ticket(2, 2_000, "SVO","SIP", 420);
    private Ticket third = new Ticket(3,  3_000, "DME", "TAS", 98);
    private Ticket four = new Ticket(4, 2800, "DME", "TBS", 165);
    private Ticket fifth = new Ticket(5, 2100, "VKO", "AER",341);
    private Ticket sixt = new Ticket(6, 1980, "VKO", "AER", 229);

    @Test
    public void shouldSortByPrice() {
        Ticket[] expected = new Ticket[] {first, sixt, second, fifth, four, third};
        Ticket[] actual = new Ticket[] {first, second, third, four, fifth, sixt};

        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortByPriceByFromTo() {
        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(four);
        manager.add(fifth);
        manager.add(sixt);

        Ticket[] expected = new Ticket[] {first, sixt, fifth};
        Ticket[] actual = manager.getAll("VKO", "AER");

        Arrays.sort(actual);

        assertArrayEquals(expected, actual);

    }
}

