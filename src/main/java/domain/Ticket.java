package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String airportOfDeparture;
    private String airportOfArrival;
    private int flightDuration;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && price == ticket.price && flightDuration == ticket.flightDuration && Objects.equals(airportOfDeparture, ticket.airportOfDeparture) && Objects.equals(airportOfArrival, ticket.airportOfArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, airportOfDeparture, airportOfArrival, flightDuration);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", airportOfDeparture='" + airportOfDeparture + '\'' +
                ", airportOfArrival='" + airportOfArrival + '\'' +
                ", flightDuration=" + flightDuration +
                '}';
    }

    @Override
    public int compareTo(Ticket o) {
        return 0;
    }
}
