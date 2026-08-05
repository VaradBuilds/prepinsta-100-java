package src.numbers;

public class P018_MaxNumberOfHandshakes {

    public static void main(String[] args) {

        int n = 30;
        int maxHandshakes = n * (n - 1) / 2;
        System.out.print("For " + n + " people there will be " + maxHandshakes + " handshakes");
    }
}
