
public final class Tone {
    private static Tone instance;
    public String value;

    private Tone(String value) {

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Tone getInstance(String value) {
        if (instance == null) {
            instance = new Tone(value);
        }
        return instance;
    }
}