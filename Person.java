import java.util.ArrayList;
import java.util.List;

class Person implements Nameable {
    private String name;
    private List<Rental> rentals;

    public Person(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    @Override
    public String correct_name() {
        return null;
    }
}
