public class Audio extends Media {
    private double loudness;
    public Audio(String name, double durration, double loudness) {
        super(name, durration);
        this.loudness = loudness;
    }
}
