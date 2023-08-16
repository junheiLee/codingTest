import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer line = new StringBuffer(sc.nextLine().trim());
		
		while(!line.toString().equals("END")) {
			System.out.println(line.reverse());
			line.delete(0, line.length());
			line.append(sc.nextLine());
		}
	}

}
	