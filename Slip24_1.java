import java.io.*;
class Vehicle
{
	int price;
 	String company;
 
 	void accept()
 	{
 		try
 		{
 			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 			System.out.print("\nCompany Name : ");
 			company=br.readLine();
 						
 			System.out.print("\nPrice : ");
 			price=Integer.parseInt(br.readLine());
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 	void display()
 	{
 		System.out.print("\n "+company+" \t "+price);
 	}
}
 
class LightMotorVehicle extends Vehicle
{
	int mileage;
 	void accept()
 	{
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		try
 		{
 			super.accept();
 			System.out.print("\nEnter Mileage : ");
 			mileage=Integer.parseInt(br.readLine());
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 	void display()
 	{
 		super.display();
 		System.out.print("\t"+mileage);
 	}
}
 
class HeavyMotorVehicle extends Vehicle
{
	int capacity_in_tons;
 	void accept()
 	{
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		try
 		{
 			super.accept();
 			System.out.print("\nEnter Capacity in Tons : ");
 			capacity_in_tons=Integer.parseInt(br.readLine());
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 	void display()
 	{
 		super.display();
 		System.out.print("\t"+capacity_in_tons);
 	}
}
 
class Slip24_1
{
	public static void  main(String args[])
 	{
 		try
 		{
 			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 			System.out.print("\nEnter The No Of Vehicles : ");
 			int n=Integer.parseInt(br.readLine());
 			Vehicle[]m= new Vehicle[n];
 			System.out.println("1. Light Motor Vehicle");
 						
 			System.out.println("2. Heavy Motor Vehicle"); 
 			System.out.println("\nEnter Type of  Vehicle : ");
 			int vtype=Integer.parseInt(br.readLine());
			if(vtype==1)
			{
 				System.out.println("\nEnter The Data for Light Motor Vehicle: ");
 				System.out.println(" ");
 				for(int i=0;i<n;i++)
 				{
 					m[i]=new LightMotorVehicle();
 					m[i].accept();
 				}
 				System.out.println("\nCompany Name \t Vehicle Price\tMileage ");
				for(int i=0;i<n;i++)
 				{
 					m[i].display();
 				}
				
			}
 			else
 			if(vtype==2)
			{
 				System.out.println("\nEnter The Data for Heavy Motor Vehicle: ");
 				for(int i=0;i<n;i++)
 				{
 					m[i]=new HeavyMotorVehicle();
 					m[i].accept();
 				}
 				System.out.println("Company Name \t Vehicle Price\tCapacity ");
				for(int i=0;i<n;i++)
 				{
 					m[i].display();
 				}
						
			}
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 }