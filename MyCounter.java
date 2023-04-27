
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

     
    @Override 
    public void run() {
      // kyle cook

        // Kyle Cook
        for(int i = 0; i < 22; i+=3) {
            System.out.print(i + "$");
        }
        // Andy Challman
        for(int i = 0; i < 46; i+=4) {
            System.out.print(i + " :Andy's Version");
        }
        		int count = 0;

		for(int i = 0; i < 7 ; i++) {//Ernesto Higuera
			count++;
		}
		System.out.println(count);
		
	    // Kid Barker
            for(int i = 0; i < 3; i++) {
                System.out.print("Kid");
            }
    
 
        //Derrick Brown
        for(int i = 0; i < 77; i +=7){
            System.out.print(i + "%");
        }

        int j = 0; // Nick S - START
        for ( ; j < number; ) { 
            if (number % 2 == 1) {
                j++;
            } else {
                j += 2;
            }
        }

        if (number == 0) {
            System.out.printf("0 is a boring non-number number.%n");
        } else if (number < 0) {
            System.out.printf("Negativity is not fun.%n");
        } else if (number % 2 == 1) {
            System.out.printf("%d is so odd, we slowly counted from 0 to %d.%n", number, j);
        } else {
            System.out.printf("I evenly counted %d times and now I've got %d.%n", number / 2, j);
        }  // Nick S - END
    }
}
