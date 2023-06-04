import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<Integer> N = new Stack<Integer>();
        Stack<Integer> P = new Stack<Integer>();


        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(201) - 100;
            if (num > 0) {
                P.push(num);
            } else if (num < 0) {
                N.push(num);
            }
        }

        while (!N.empty() && !P.empty()) {
            System.out.println(N.pop() + " " + P.pop());
        }
    }
}
