package lab_3_3;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int selection =0;
		Scanner scan = new Scanner(System.in);
		RealEstate re =new RealEstate("deu_re", new Address("str", "buca", "izmir"));
		
		do
		{
				System.out.println("1- Add a house ");
				System.out.println("2- Display all houses"); 
				System.out.println("	3- Search by price ");
				System.out.println("4- Exit" );
				
				System.out.println("enter an ýoperation");
				selection = scan.nextInt();
			
				if(selection==1)
				{
					
					System.out.println("enter kind of the house");
					String kind =scan.nextLine();
					System.out.println("enter number of rooms");
					int num_rooms=scan.nextInt();
					
					System.out.println("enter the area");
					int area=scan.nextInt();
					
					System.out.println("enter price");
					int price=scan.nextInt();
					
					
					System.out.println("enter the street of house");
					String street=scan.nextLine();
					System.out.println("enter the town");
					String town=scan.nextLine();
					System.out.println("enter the city");
					String city=scan.nextLine();
					
					re.addHouse(new House(kind, num_rooms, new Address(street, town, city), area, price));
				}
				
				else if(selection==2)
				{
					System.out.println(re.displayAllHouses());
				}
				else if(selection==3)
				{
				System.out.println("enter first price");
				int p1=scan.nextInt();
				System.out.println("enter 2. price");
				int p2=scan.nextInt();
				}
			
				
			
			
			
		}while(selection !=4);
		

	}

}
