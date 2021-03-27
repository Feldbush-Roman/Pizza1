import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pizza {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет,ты хочешь пиццу?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("да")) {
            System.out.println("Готовлю пиццу");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Пицца приготовлена, кушац подано");

        } else if (s.equals("нет")) {
            System.out.println("Пока");
            System.exit(0);
        }
    }
}
