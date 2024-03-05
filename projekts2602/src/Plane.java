public class Plane {
    @Override
    public String toString() {
        return
                " model ='" + model + '\'' +
                ", production year = " + production_year +
                ", flight history = " + flight_history +
                ", crashed = " + crashed ;

    }

    public final String model;
    public final int production_year;
    public final int flight_history;
    public final boolean crashed;

    public Plane(String model, int production_year, int flight_history, boolean crashed){
        this.model = model;
        this.production_year = production_year;
        this.flight_history = flight_history;
        this.crashed = crashed;

    }
}
