
public class Business extends Airport{
    public final int seatsAvalaible;

    public Business(String origin, String destination, int flighttime, String classes, int seats_avalaible) {
        super(origin, destination, flighttime, classes);
        seatsAvalaible = seats_avalaible;
    }

    public String printinfo(int food, int drink){
        String bsn  = "Customer ordered "+food+" drinks and "+drink+" snacks ";


        return (bsn);
    }



}
