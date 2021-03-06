package OSOS;

import java.util.ArrayList;
public class Order 
{
	private int uoID; 
	private String cID; 
	private String pID;
	private int month;	
	private int day;
	private int amount; 
	
	private int period;
	private int monthend; 
	private int dayend;
	private boolean repeated; 
	
	
	private ArrayList <Integer> uoIDList = new ArrayList <Integer>();
	private ArrayList <String> cIDList = new ArrayList <String>();
	private ArrayList <String> pIDList = new ArrayList <String>();
	private ArrayList <Integer> monthList = new ArrayList <Integer>();
	private ArrayList <Integer> dayList = new ArrayList <Integer>();
	private ArrayList <Integer> amountList = new ArrayList <Integer>();
	
	private ArrayList <Integer> periodList = new ArrayList <Integer>();
	private ArrayList <Integer> monthendList = new ArrayList <Integer>();
	private ArrayList <Integer> dayendList = new ArrayList <Integer>();
	private ArrayList <Boolean> repeatedList = new ArrayList <Boolean>();
	
	
	private String monthsarray [] = {"", "January", "February", "March", "April", "May", "June", 
									"July", "August", "September", "October", "November", "December"};
	
	public Order () {
		uoID = 0;
		cID = "Null, Inc,";
		pID = "00";
		month = 00;
		day = 0;
		amount = 0;
		
		
		period = 0;
		monthend = 0;
		dayend = 0;
		repeated = false;
	}
	
	public void addOrder(int uoID, String cID, String pID, int month, int day, int amount) 
	{
		this.uoID = uoID;
		this.cID = cID;
		this.pID = pID;
		this.month = month;
		this.day = day;
		this.amount = amount;
		repeated = false;

		
		
		
		uoIDList.add(uoID);
		cIDList.add(cID);
		pIDList.add(pID);
		monthList.add(month);
		dayList.add(day);
		amountList.add(amount);
		
		periodList.add(0);
		monthendList.add(0);
		dayendList.add(0);
		repeatedList.add(false);
		
	}
	
	public void addOrder (int uoID, String cID, String pID, int month, int day, int amount, int period, int monthend, int dayend) 
	{
		this.uoID = uoID;
		this.cID = cID;
		this.pID = pID;
		this.month = month;
		this.day = day;
		this.amount = amount;
		
		this.period = period;
		this.monthend = monthend;
		this.dayend = dayend;
		repeated = true;
		
		uoIDList.add(uoID);
		cIDList.add(cID);
		pIDList.add(pID);
		monthList.add(month);
		dayList.add(day);
		amountList.add(amount);
		
		periodList.add(period);
		monthendList.add(monthend);
		dayendList.add(dayend);
		repeatedList.add(true);
		
	}
	
	public boolean deleteOrder (int ID) 
	{
		boolean success = false;
		int index = 0;
		int IDinarray;
		for (int i = 0; i<uoIDList.size(); i++) 
		{
			IDinarray = uoIDList.get(i);
			if (IDinarray == ID) 
			{
				index = i;
				success = true;
				break;
			}
		}
		
		
		if (success) 
		{
			uoIDList.remove(index);
			cIDList.remove(index);
			pIDList.remove(index);
			monthList.remove(index);
			dayList.remove(index);
			amountList.remove(index);
			
			periodList.remove(index);
			monthendList.remove(index);
			dayendList.remove(index);
			repeatedList.remove(index);
		}
		
		return success;
	}
	
	public void printOrders()
	{
		for (int i=0; i<uoIDList.size(); i++)
		{
			System.out.print(uoIDList.get(i) + ", ");
			System.out.print(cIDList.get(i) + ", ");
			System.out.print(pIDList.get(i) + ", ");
			System.out.print(monthList.get(i) + "/");
			System.out.print(dayList.get(i) + "/2019, ");
			System.out.print(amountList.get(i));
			
			if (repeatedList.get(i)) {
				System.out.print(", " + periodList.get(i));
				System.out.print(", " + monthendList.get(i) + "/");
				System.out.print(dayList.get(i) + "/2019");
			}
			
			
			System.out.println();
		}
		
	}
	
	public void printReport()
	{
		for (int j=1; j<=12; j++)
		{
			System.out.println(monthsarray[j] + ":");
			for (int i=0; i<uoIDList.size(); i++)
			{
				if (monthList.get(i) == j)
				{
					System.out.print("2019/");
					System.out.print(monthList.get(i) + "/");
					System.out.print(dayList.get(i) + ", ");
					System.out.print(pIDList.get(i) + ", ");
					System.out.print(amountList.get(i));
					if (repeatedList.get(i)) 
					{
						System.out.print(", " + periodList.get(i));
						System.out.print(", " + monthendList.get(i) + "/");
						System.out.print(dayList.get(i) + "/2019");
					}
					System.out.println();
				}
			}
		}
	}
	
	
	
	public boolean listOrders(String cID)
	{
		boolean success = false;
		for (int i=0; i<cIDList.size(); i++)
		{
			if (cIDList.get(i).contains(cID)) 
			{
				success = true;
				System.out.print(uoIDList.get(i) + ", ");
				System.out.print(cIDList.get(i) + ", ");
				System.out.print(pIDList.get(i) + ", ");
				System.out.print(monthList.get(i) + "/");
				System.out.print(dayList.get(i) + "/2019, ");
				System.out.print(amountList.get(i));
				
				if (repeatedList.get(i)) 
				{
					System.out.print(", " + periodList.get(i));
					System.out.print(", " + monthendList.get(i) + "/");
					System.out.print(dayList.get(i) + "/2019");
				}
				
				
				System.out.println();
				
			}
			
		}
		return success;
		
	}
	
}
