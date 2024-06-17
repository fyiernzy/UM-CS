package WIA1003_CSA_Report;

/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {
        // Question 1
        int[] arr = {0, 2, 5, 9, 10};
        int result = 0;
        int ecx = arr.length - 1;
        for(int esi = 0; esi < ecx; esi++) {
            int eax = arr[esi+1];
            eax -= arr[esi];
            result += eax;
        }
        System.out.println(result);

        // Question 2
        for(int edx = 1; edx < 9; edx++) {
            for(int eax = edx; eax < 9; eax++) {
                System.out.print(eax);
            }
            System.out.println();
        }

        // Question 3
        int sum = 0;
        int ecx = 3;
        String prompt = "Enter 32-bit integer: ";
        String output = "The sum of the 32-bit integer is: ";

        for(int i = 0; i < ecx; i++) {
            System.out.print(prompt);
            int eax = Integer.parseInt(System.console().readLine());
            sum += eax;
        }

        System.out.print(output);
        System.out.println(sum);

        // Question 4
        String prompt = "Enter mark (0-100): ";
        String result = "Grade : ";
        char al = 0;

        System.out.print(prompt);
        int eax = Integer.parseInt(System.console().readLine());

        if(eax >= 90)
            al = 'A';
        else if(eax >= 80)
            al = 'B';
        else if(eax >= 70)
            al = 'C';
        else if(eax >= 60)
            al = 'D';
        else
            al = 'F';
        
        System.out.print(result);
        System.out.println(al);
    }
}