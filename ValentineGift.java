import java.util.*;

public class ValentineGift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        int nMin = 1;
        int bMin = 2;
        int cMin = 4;
        int x=-1;
        int y=-1;
        int z=-1;
        while(true){
            x++;
            //System.out.println(x+" "+ nMin*x);
            if(nMin*x>n){
                x--;
                break;
            }
        }
        while(true){
            y++;
            //System.out.println(y+" "+ bMin*y);
            if(bMin*y>b){
                y--;
                break;
            }
        }
        while(true){
            z++;
            //System.out.println(z+" "+ cMin*z);
            if(cMin*z>c){
                z--;
                break;
            }
        }
        System.out.println(Math.min(x,Math.min(y,z)));
    }
}