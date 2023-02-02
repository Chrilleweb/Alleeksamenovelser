import java.util.ArrayList;

public final class Motherboard {
    private ArrayList<SataDrive> sataDrives;


    public Motherboard(){
        this.sataDrives = new ArrayList<>();
    }

    public ArrayList<SataDrive> udskriv(){
        return sataDrives;
    }

    public void connectSataDrive(SataDrive sataDrive){
        if (sataDrives.size() == 4){
            System.out.println("Space is full ");
        } else {
            sataDrives.add(sataDrive);
            System.out.println("Connected");
        }
    }

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();
        SataDrive sataDrive = new SataDrive("Model 1");
        motherboard.connectSataDrive(sataDrive);
        System.out.println(motherboard.udskriv());
    }
}

