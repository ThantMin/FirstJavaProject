public class sample {
    String name = "Ead";
    static int age = 20;

    public static void main(String[] args) {

//Statics And Non Static Test
        put();
        sample.put();
        System.out.println(age);

        sample obj = new sample();
        obj.send();
        System.out.println(obj.name);

        // keywords
        int a = 30;
        int b = 60;
        boolean c = (a == b);

        System.out.print(c);
    }

    public void send() {
        System.out.print("Send");
    }

    public static void put() {
        System.out.print("out");
    }
}