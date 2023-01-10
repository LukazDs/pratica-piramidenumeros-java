public class App {
    public static void main(String[] args) throws Exception {
        int numberInformed = 9;
        String msg = "";

        for (int i = 1; i <= numberInformed; i++) {
            for (int j = 0; j < i; j++) {
                msg += i;
            }

            System.out.println(msg);
            msg = "";
        }
    }
}
