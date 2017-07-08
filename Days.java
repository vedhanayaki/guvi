package Tree;
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=s.next();
		if(a!="MOn"||a!="Tue"||a!="Wed"||a!="Thu"||a!="Fir"||a!="sat") {
			System.out.println("False");
		}
		else if(a=="MOn"||a=="Tue"||a=="Wed"||a=="Thu"||a=="Fir"||a=="sat"){
			System.out.println("True");
		}
		else {
			System.out.println();
		}
		
	}

}
