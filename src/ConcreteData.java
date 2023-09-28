public class ConcreteData implements Data {
    private String data = "";

    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
