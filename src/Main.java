import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatre()) {
            validEvent(event);
        }
        System.out.println(Arrays.toString(getMovies()));
        System.out.println(Arrays.toString(getTheatre()));
        System.out.println("Все события корректны!");
    }

    public static Movie[] getMovies() {
        Movie movie1 = new Movie("'Зеленая миля'", 1999, 16);
        Movie movie2 = new Movie("'Список Шиндлера'", 1993, 16);
        Movie movie3 = new Movie("'Побег из Шоушенка'", 1994, 16);
        return new Movie[]{movie1, movie2, movie3};
    }


    public static Theatre[] getTheatre() {
        Theatre theatre1 = new Theatre("'Чайка'", 1898, 12);
        Theatre theatre2 = new Theatre("'Ревизор'", 1923, 12);
        Theatre theatre3 = new Theatre("'Эйнштейн на пляже'", 1976, 16);
        return new Theatre[]{theatre1, theatre2, theatre3};
    }

    public static void validEvent(Event event) throws RuntimeException {

        if (event.title == null || event.age == 0 || event.releaseYear == 0) {
            throw new RuntimeException("Некорректное событие");
        }

    }

}


