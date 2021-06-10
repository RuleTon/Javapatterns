public class DemoTone {

    public static void main (String[] args) {
        System.out.println("Message" + ":" + "\n");
        Tone tone = Tone.getInstance("Lo");
        Tone tone1 = Tone.getInstance("Lu");
        System.out.println(tone.value);
        System.out.println(tone1.value);

    }
}
