public class Economy extends Airport {


    public boolean upgrade;

    public Economy(String origin, String destination, int flighttime, String classes, int seats_airplane) {
        super(origin, destination, flighttime, classes);
    }

    public String printinfo(int number, int price, boolean upgrade, int seats_avalaible) {
        this.upgrade = upgrade;
        String bsn = " There were "+number+" passengers, who paid "+price+"$ for the tickets and it is "+upgrade+" that they are eligible for promotion. There are "+seats_avalaible+" in total.";



        return (bsn);
    }
}
