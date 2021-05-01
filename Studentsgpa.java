import java.util.Arrays;
import java.util.Scanner;

public class Studentsgpa {
    String name;
    Scanner scanner = new Scanner(System.in);
    Scanner scannerstr = new Scanner(System.in);
  
    Studentsgpa(String name) {
        this.name = name;
    }

    public String calsgpa() {
        System.out.println();
        System.out.println("Enter details of : " + this.name);
        System.out.println();
        System.out.println("Enter the number of subjects");
        int num_of_subjects = scanner.nextInt();
        System.out.println();

        int[] marks_array = new int[num_of_subjects];
        String[] subnmae_array = new String[num_of_subjects];
        int[] credit_array = new int[num_of_subjects];

        for (int k=0; k<num_of_subjects; k++) {
            System.out.println("Enter subject " + (k+1) + " name ");
            subnmae_array[k] = scannerstr.nextLine();
        }
        System.out.println();

        for (int i=0; i<num_of_subjects; i++) {
            System.out.println("Enter your marks in " + subnmae_array[i]);
            marks_array[i] = scanner.nextInt();
        }

        for (int l=0; l<num_of_subjects; l++) {
            System.out.println("Enter credits assigned for " + subnmae_array[l]);
            credit_array[l] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Stuent name : " + this.name);
        System.out.println();
        System.out.println("Subjects with marks");
        for (int j = 0; j<num_of_subjects; j++) {
            System.out.println(subnmae_array[j] + " : " + marks_array[j]);
        }
        System.out.println();
        System.out.println("Average is : " + ((Arrays.stream(marks_array).sum()) / num_of_subjects));
        System.out.println();
        System.out.println("Subjects with points");

        for (int j = 0; j<num_of_subjects; j++) {
            if (marks_array[j] >= 50 && marks_array[j] <=99){
                System.out.println(subnmae_array[j] + " : " + ((marks_array[j]/10)+1));
            }
            else if (marks_array[j] == 100){
                System.out.println(subnmae_array[j] + " : " + 10);
            }
            else if (40 <= marks_array[j] && marks_array[j] < 50) {
                if (marks_array[j] <= 45) {
                    System.out.println(subnmae_array[j] + " : " + 4);
                }
                else {
                    System.out.println(subnmae_array[j] + " : " + 5);
                }
            }
            else {
                System.out.println(subnmae_array[j] + " : " + 0);
            }
        }
        System.out.println();
        System.out.println("Credit points : ");
        double[] sgpa_array = new double[num_of_subjects];
        for (int j = 0; j<num_of_subjects; j++) {
            if (marks_array[j] >= 50 && marks_array[j] <=99){
                System.out.println(subnmae_array[j] + " : " + (((marks_array[j]/10)+1) * credit_array[j]));
                sgpa_array[j] = ((((double) (marks_array[j]/10)+1) * credit_array[j])) / (Arrays.stream(credit_array).sum());

            }
            else if (marks_array[j] == 100){
                System.out.println(subnmae_array[j] + " : " + 10 * credit_array[j]);
                sgpa_array[j] = (double) 10 * credit_array[j] / (Arrays.stream(credit_array).sum());
            }
            else if (40 <= marks_array[j] && marks_array[j] < 50) {
                if (marks_array[j] <= 45) {
                    System.out.println(subnmae_array[j] + " : " + 4 * credit_array[j]);
                    sgpa_array[j] = (double) 4 * credit_array[j] / (Arrays.stream(credit_array).sum());
                }
                else {
                    System.out.println(subnmae_array[j] + " : " + 5 * credit_array[j]);
                    sgpa_array[j] = (double) 5 * credit_array[j] / (Arrays.stream(credit_array).sum());
                }
            }
            else {
                System.out.println(subnmae_array[j] + " : " + 0);
                sgpa_array[j] = 0;
            }
        }

        System.out.println();

        System.out.println();
        return "SGPA : " + Arrays.stream(sgpa_array).sum();
    }
}
