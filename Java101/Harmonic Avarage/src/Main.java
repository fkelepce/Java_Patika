public class Main {
    public static void main(String[] args) {
        int[] list = {1,5};

        double harmonicSum = 0;

        for (double i=1; i<= list.length; i++){
            harmonicSum += 1/i;
        }
        double harmonicAvarage = list.length / harmonicSum;
        System.out.println(harmonicAvarage);
        }
    }


