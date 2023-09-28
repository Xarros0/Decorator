public class AccessControlDecorator extends DataDecorator {
    private String password;

    public AccessControlDecorator(Data decoratedData, String password) {
        super(decoratedData);
        this.password = password;
    }

    @Override
    public void writeData(String data) {
        if (authenticate()) {
            super.writeData(data);
        } else {
            System.out.println("Access denied. Incorrect password.");
        }
    }

    @Override
    public String readData() {
        if (authenticate()) {
            return super.readData();
        } else {
            System.out.println("Access denied. Incorrect password.");
            return null;
        }
    }

    private boolean authenticate() {
        // Tarkista salasana ja palauta true, jos se on oikein
        // Tässä voit lisätä haluamasi tarkistuslogiikan
        return "salasana".equals(password);
    }
}
