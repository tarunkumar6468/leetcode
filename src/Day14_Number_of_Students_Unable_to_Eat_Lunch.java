import java.util.Scanner;
import java.util.Stack;

public class Day14_Number_of_Students_Unable_to_Eat_Lunch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int []students = new int[n];
        int [] sandwiches = new int[m];
        for(int i = 0;i<n; i++){
            students[i] = sc.nextInt();

        }
        for(int i = 0;i<m; i++){

            sandwiches[i] = sc.nextInt();
        }
     int ans = doNotGetFoodCount(students,sandwiches);
        System.out.println(ans);

    }
    public static int doNotGetFoodCount(int []student,int [] sandwiches){
        int OnesCount  = 0;
        int zeroCount = 0;
        for(int i = 0; i<student.length; i++){
            if(student[i]==1){
                OnesCount++;
            }
            else {
                zeroCount++;
            }
        }
        for(int i = 0; i<sandwiches.length; i++){

            if(sandwiches[i]==1 && OnesCount==0){
                return zeroCount;
            }
            else if(sandwiches[i]==0 && zeroCount==0){
                return OnesCount;
            }
            if(sandwiches[i]==1){
                OnesCount--;
            }
            else {
                zeroCount--;
            }
        }
        return 0;
    }

    }
