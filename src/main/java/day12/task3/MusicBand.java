package day12.task3;

public class MusicBand {

    private final String nameBand;
    private final int yearBand;

    public MusicBand(String nameBand, int yearBand) {
        this.nameBand = nameBand;
        this.yearBand = yearBand;
    }

    public int getYearBand() {
        return yearBand;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", yearBand=" + yearBand +
                '}';
    }
}
