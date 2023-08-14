import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String num = sc.nextLine();
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            result += num.charAt(i)-'0';
        }
        
        System.out.println(result);
    }
}