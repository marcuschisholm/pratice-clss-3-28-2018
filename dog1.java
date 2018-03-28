package dawg;

import java.util.Scanner;

public class dog1 {
	public static void main(String[]args){
		dog[]dognames=new dog[3];
		Scanner Scan=new Scanner(System.in);
		
		
		System.out.println("enter 3 dogs names and breeds");
		
		for (int i=0;i<3;i++){
			String name=Scan.nextLine();
			String breed=Scan.nextLine();
			
			dognames[i]=new dog(name,breed);
			
			
		}
		System.out.println(dognames[1].dogname);
		System.out.println(dogbreed[1].dogbreed);
		

}
}