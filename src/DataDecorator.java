public abstract class DataDecorator implements Data {
    protected Data decoratedData;

    public DataDecorator(Data decoratedData) {
        this.decoratedData = decoratedData;
    }

    @Override
    public void writeData(String data) {
        decoratedData.writeData(data);
    }

    @Override
    public String readData() {
        return decoratedData.readData();
    }
}
