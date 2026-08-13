public class Factorial {
    public void fact() {
        int num = 5;
        int res = 1;

        while (num > 0) {
            res = res * num;
            num--;
        }

        System.out.println("The Factorial value is: " + res);
    }
}
