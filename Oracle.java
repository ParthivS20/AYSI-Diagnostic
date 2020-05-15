import java.util.*;

public class Oracle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        str=str.toLowerCase();
        if(str.contains("nothing")){
            str=str.replaceAll("nothing","");
        }
        String[] splited = str.split("\\s+");
        int x=0;
        for(int i=0;i<splited.length;i++){
            if(splited[i].equals("not")){
                x++;
            }
        }
        if(x%2==0){
            System.out.print("LOVE");
        }
        else if(x%2==1){
            System.out.print("SAD");
        }
    }
}