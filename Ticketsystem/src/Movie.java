public class Movie {
    private String name;
    private String director;
    private String actor;
    private String type;
    private String synopsis;
    private double time;


    public Movie() {
    }


    public Movie(String name, String director, String actor, String type, String synopsis, double time) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.type = type;
        this.synopsis = synopsis;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }


}
