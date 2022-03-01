package nicneumimuwu;
import java.util.Scanner;

public class NicNeumimUwu {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int pr=scanner.nextInt();
        scanner.nextLine();
        
        String[] cislo=new String[pr];
        for(int x=0; x<pr; x++){
            cislo[x]=scanner.nextLine();
        }
        for(int z=0; z<pr; z=z-1){
            System.out.println(cislo);
        }
        
    }
    
}
