public class Video extends Media {
    private String acpectRatio;
    public Video(String name, double durration, String acpectRatio) {
        super(name, durration);
        this.acpectRatio = acpectRatio;
    }
}
