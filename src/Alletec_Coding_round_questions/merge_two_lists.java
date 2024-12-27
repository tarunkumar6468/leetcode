package Alletec_Coding_round_questions;
import java.util.*;
public class merge_two_lists {



        public static void mergeLists(int[] list1, int[] list2) {
            int i = 0, j = 0;

            // Loop until one of the lists is exhausted
            while (i < list1.length && j < list2.length) {
                if (list1[i] < list2[j]) {
                    System.out.print(list1[i++] + " ");
                } else {
                    System.out.print(list2[j++] + " ");
                }
            }
            // Print remaining elements of list1 if any
            while (i < list1.length) {
                System.out.print(list1[i++] + " ");
            }

            // Print remaining elements of list2 if any
            while (j < list2.length) {
                System.out.print(list2[j++] + " ");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int n1 = sc.nextInt();     // take an input for first list
            int[] list1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                list1[i] = sc.nextInt();
            }


            int n2 = sc.nextInt();  // take an input for second list
            int[] list2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                list2[i] = sc.nextInt();
            }

            System.out.print("Merged list: ");
            mergeLists(list1, list2);

        }
    }


