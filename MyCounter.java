public class MyCounter extends Thread {

    /*
     * Make a branch
     * Implement this run method
     * 
     * What does run do? 
     *  It counts from 0 to any number of your choosing
     *  It counts by any increment of your choosing
     *  It prints the number out when it's finished
     * 
     * I want you to merge your method into the main branch
     * Upload the file you have locally after you merge it
     * add a comment with your name next to your loop in the run method
     * 
     * While mergeing DO NOT overrite someone else's code
     */

    private int number;

    public MyCounter(int number) {
        this.number = number;
    }

    @Override 
    public void run() {
        int i = 0;        
        for ( ; i < number; ) { // Nick S
            if (number % 2 == 1) {
                i++;
            } else {
                i += 2;
            }
        }

        if (number == 0) {
            System.out.printf("0 is a boring non-number number.%n");
        } else if (number < 0) {
            System.out.printf("Negativity is not fun.%n");
        } else if (number % 2 == 1) {
            System.out.printf("%d is so odd, we slowly counted from 0 to %d.%n", number, i);
        } else {
            System.out.printf("I evenly counted %d times and now I've got %d.%n", number / 2, i);
        }
    }
}   