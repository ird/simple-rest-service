package uk.org.ird;

public class Film {
    private final long id;
    private final String name;
    private final int year;
    public Film(long id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }
    public long getId() { return id; }
    public String getFullTitle() {
        String title = name + "(%s)";
        return String.format(title, year);
    }
}
