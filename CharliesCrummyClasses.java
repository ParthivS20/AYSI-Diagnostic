import java.util.*;

public class CharliesCrummyClasses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        String[] names = new String[nums];
        int[] grades = new int[nums];
        for(int i=0;i<nums;i++){
            names[i] = input.next();
            grades[i] = input.nextInt();
        }
        int[] index = new int[names.length];
        input.close();
        for(int i=0;i<names.length-1;i++){
            if(grades[i]<grades[i+1]){
                index[i]=i;
            }
            if(grades[i]>grades[i+1]){
                index[i]=i+1;
            }
        }
        System.out.print(names[index[0]]);
    }
}
