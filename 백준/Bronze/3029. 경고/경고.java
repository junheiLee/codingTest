import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] now = sc.nextLine().split(":");
        String[] bomb = sc.nextLine().split(":");
        
        int s = Integer.parseInt(bomb[2]) - Integer.parseInt(now[2]);
        int m = Integer.parseInt(bomb[1]) - Integer.parseInt(now[1]);
        int h = Integer.parseInt(bomb[0]) - Integer.parseInt(now[0]);
        
        if(s<0) {
            s += 60;
            m -= 1;
        }
        
        if(m<0) {
            m += 60;
            h -= 1;
        }
        
        if(h<0) {
            h += 24;
        }
        
        if(h== 0 && m== 0 && s==0) {
            h = 24;
        }

        System.out.println(String.format("%02d:%02d:%02d",h, m, s ));
    }
}