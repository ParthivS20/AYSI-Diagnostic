import java.util.*;

public class DerekssBoomers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        int[] prices = new int[nums];
        for(int i=0;i<nums;i++){
            prices[i] = input.nextInt();
        }
        input.close();
        int temp; 
            for (int i = 0; i < prices.length; i++){  
                for (int j = i + 1; j < prices.length; j++)   
                {  
                    if (prices[i] > prices[j])   
                    {  
                        temp = prices[i];  
                        prices[i] = prices[j];  
                        prices[j] = temp;  
                    }  
                }  
            }
        for(int i=0;i<prices.length;i++){
            System.out.println(prices[i]);  
        }
    }
}