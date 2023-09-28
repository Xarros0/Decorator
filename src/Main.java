public class Main {
    public static void main(String[] args) {
        // Luo dataolio ilman pääsynvalvontaa
        Data data = new ConcreteData();

        // Kirjoita ja lue data
        data.writeData("Tämä on salainen tieto.");
        System.out.println("Luetut tiedot: " + data.readData());

        // Luo dataolio pääsynvalvonnalla
        Data securedData = new AccessControlDecorator(new ConcreteData(), "salasana");

        // Yritä kirjoittaa ja lukea data ilman oikeaa salasanaa
        securedData.writeData("Toinen salainen tieto.");
        System.out.println("Luetut tiedot: " + securedData.readData());

        // Yritä kirjoittaa ja lukea data oikealla salasanalla
        securedData.writeData("Toinen salainen tieto.");
        System.out.println("Luetut tiedot: " + securedData.readData());
    }
}
