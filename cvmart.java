import java.util.Scanner;
class signup
{
	static Scanner sc=new Scanner(System.in);
	private String name;
	private long ph_no;
	private int pass;
	private String mail;
	int Total=0;
	void set(int pass)
	{
		this.pass=pass;
	} 
	void set2(String mail)
	{
		this.mail=mail;	
	}
	void set3(String name)
	{
		this.name=name;	
	}
	void set4(long ph_no)
	{
		this.ph_no=ph_no;	
	}
	int get()	
	{
		return pass;
	}
	long get2()
	{
		return ph_no;
	}
	void shirts()
	{
		System.out.println("choose No of Items");
		int k=sc.nextInt();
		Total=k*500+Total;
	}
	void Pants()
	{
		System.out.println("choose No of Items");
		int k=sc.nextInt();
		Total=k*600+Total;
	}
	void Wallets()
	{
		System.out.println("choose No of Items");
		int k=sc.nextInt();
		Total=k*200+Total;
	}
	void Tshirts()
	{
		System.out.println("choose No of Items");
		int k=sc.nextInt();
		Total=k*100+Total;
	}
	void Jeans()
	{
		System.out.println("choose No of Items");
		int k=sc.nextInt();
		Total=k*200+Total;
	}
	void Chudidhar()
	{
		System.out.println("choose No of Items");
		int k=sc.nextInt();
		Total=(k*300)+Total;
	}
	void Milk()
	{
		System.out.println("choose No of Packets");
		int k=sc.nextInt();
		Total=Total+(k*30);
	}
	void Curd()
	{
		System.out.println("choose No of Packets");
		int k=sc.nextInt();
		Total=Total+(k*30);
	}
	void CookingOil()
	{
		System.out.println("choose No of Kgs");
		int k=sc.nextInt();
		Total=Total+(k*150);
	}
	void Sugar()
	{
		System.out.println("choose No of Kgs");
		int k=sc.nextInt();
		Total=Total+(k*100);
	}
}
class Signin extends signup
{
	public static void main(String[]args)
	{
		
		System.out.println("Welcome to CVMart");
		System.out.println("Please signup");
		System.out.println("Enter details");
		System.out.println("Enter your name :");
		Signin obj=new Signin();
		obj.set3(sc.nextLine());
		System.out.println("Enter your ph no :");
		obj.set4(sc.nextLong());
		//System.out.println(obj.get2());
		System.out.println("Enter your mail :");
		obj.set2(sc.nextLine());
		System.out.println("Enter your Password :");
		obj.set(sc.nextInt());
		//System.out.println(obj.get());
		System.out.println("Signup completed,Now signin to ur Account");
		System.out.println("Enter ur Phone number :");
		long phn=sc.nextLong();
		System.out.println("Enter your Password");
		int password=sc.nextInt();
		if(phn==obj.get2()&&password==obj.get())
		{
			while(true)
			
			{
				System.out.println("Please choose your Item :");
				System.out.println("Enter 1 for Clothing" );
				System.out.println("Enter 2 for Provisions");
				int n=sc.nextInt();
				
				switch(n)
				{
					case 1:
					System.out.println("Please choose Gender ");
					System.out.println("Enter 1 for Male");
					System.out.println("Enter 2 for Female");
					int n2=sc.nextInt();
					
					switch(n2)
					{
						case 1:
						System.out.println("Male");
						System.out.println("each shirt cost is 500 ");
						System.out.println("Enter 1 for Shirts");
						System.out.println("each pant cost is 700");
						System.out.println("Enter 2 for Pants");
						System.out.println("each wallet cost is 200");
						System.out.println("Enter 3 for Wallets");
						int n3=sc.nextInt();
						
						switch(n3)
						{
							case 1:
							obj.shirts();	
							break;
							case 2:
							obj.Pants();
							break;
							case 3:
							obj.Wallets();
							
						}
						
						break;
						case 2:
						System.out.println("Female");
						System.out.println("each T-shirt cost is 600");
						System.out.println("Enter 1 for T-Shirts");
						System.out.println("each pants cost is 700");
						System.out.println("Enter 2 for Jeans");
						System.out.println("each chudidhar cost is 1200");
						System.out.println("Enter 3 for Chudidhar");
						int n4=sc.nextInt();
						switch(n4)
						{
							case 1:
							obj.Tshirts();
							break;
							case 2:
							obj.Jeans();
							break;
							case 3:
							obj.Chudidhar();
							
						}
					}
					
					break;
					case 2:
					System.out.println("Provisions");
					System.out.println("Please Enter 'a'for Dairy Products, 'b' for	Groceries");
					char n5=sc.next().charAt(0);
					switch(n5)
					{
						case 'a':
						System.out.println("enter 1 for Milk, 2 for Curd ");
						int n6=sc.nextInt();

						switch(n6)
						{
							case 1:
							obj.Milk();
							break;
							case 2:
							obj.Curd();
							
						}
						break;
						case 'b':
						System.out.println("Enter 1 for Cooking Oil, 2 for Sugar");
						int n7=sc.nextInt();
						switch(n7)
						{
							case 1:
							obj.CookingOil();
							break;
							case 2:
							obj.Sugar();
							
							
						}
					}
				
				}
				
				
				System.out.println("Total Amount to be paid :"+obj.Total);
				System.exit(0);
			}	
		
		}
		else
			System.out.print("Inavlid Credentials,Please Try again");
	}
	
}