public class Movie {
    private String title;
    private String director;
    private String category;
    private int duration;

    public Movie() {
        this.title = "";
        this.director = "";
        this.category = "";
        this.duration = 0;
    }

    public Movie(String title, String director, String category, int duration) {
        this.title = title;
        this.director = director;
        this.category = category;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDirector: " + director + "\nCategory: " + category + "\nDuration: " + duration + " minutes";
    }
}