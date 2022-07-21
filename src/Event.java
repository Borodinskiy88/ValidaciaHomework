public abstract class Event {
    public String title;
    public int releaseYear;
    public int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }


    public String toString() {
        return title + ", " + releaseYear + "год" + ", " + age + "+";
    }
}
