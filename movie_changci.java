public class movie_changci {
    private String changci;

    private String name;
    private String hall;
    private String show_time;
    private double price;
    private    String [][] seats = new String[7][12];


    public movie_changci() {
    }

    public movie_changci(String changci, String name, String hall, String show_time, double price,String[][] seats) {
        this.changci = changci;
        this.hall = hall;
        this.name = name;
        this.show_time = show_time;
        this.price = price;
        this.seats=seats;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 12; j++) {
                seats[i][j] = "o";
            }
        }

    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChangci() {
        return changci;
    }

    public void setChangci(String changci) {
        this.changci = changci;
    }

    public String[][] getSeats() {
        return seats;
    }

    public void setSeats(String[][] seats) {
        this.seats = seats;
    }
    public String fun(String[][] seats,int number,int nume){
        return seats[number][nume];
    }


}
