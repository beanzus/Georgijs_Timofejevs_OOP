public class Airport {
    public final String origin;
    public final String destination;
    public final int flighttime;
    public String classes;

    public Airport(String origin, String destination, int flighttime, String classes){
        this.origin = origin;
        this.destination = destination;
        this.flighttime = flighttime;
        this.classes = classes;
        
    }

    @Override
    public String toString() {
        return
                " Departures = " + origin + '\'' +
                " Destination = " + destination + '\'' +
                " Flight time = " + flighttime +
                " Class = " + classes;

    }
    public int rating() {

        return (flighttime);
    }

}
