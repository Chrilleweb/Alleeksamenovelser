public class Producer {
    private String producer;

    public Producer(String producer){
        this.producer = producer;
    }

    public String getProducer(){
        return producer;
    }

    @Override
    public String toString() {
        return producer;
    }
}
