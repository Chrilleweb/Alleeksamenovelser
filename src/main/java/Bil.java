public class Bil {
    private Trailer trailer;
    private double weight;

    public Bil(double weight){
        this.weight = weight;
    }

    public double totalVægten(Trailer trailer){
        double totalVægt = weight + trailer.getWeight();
        if (totalVægt < 3500){
            System.out.println("Trailer tilkoplet");
        } else {
            System.out.println("too heavy");
        }
        return totalVægt;
    }

    public static void main(String[] args) {
        Bil bil = new Bil(1500);
        Trailer trailer1 = new Trailer(3000);
        System.out.println(bil.totalVægten(trailer1));
    }
}
