package OSOS;
import java.util.Scanner;
import OSOS.Order;
public class Test 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		Order myOrder = new Order();
										
		myOrder.addOrder(2569, "Alphabet, Inc.", "A1", 4, 12, 1);
		myOrder.addOrder(2362, "ABC Inc", "C2", 4, 18, 7);
		myOrder.addOrder(8192, "IDK, Inc.", "E2", 6, 12, 1, 2, 6, 27);
		myOrder.addOrder(7623, "Com Inc.", "B2", 2, 12, 5, 2, 8, 27);
		myOrder.addOrder(9109, "Afaf Inc.", "A2", 3, 18, 9);
		myOrder.addOrder(2569, "ASDF, Inc.", "A1", 1, 12, 1);
		myOrder.addOrder(2362, "QWERTY Inc", "C2", 12, 18, 7);
		myOrder.addOrder(8192, "BABADT, Inc.", "E2", 10, 12, 1, 2, 6, 27);
		myOrder.addOrder(7623, "Foo", "B2", 8, 12, 5, 2, 8, 27);
		myOrder.addOrder(9109, "GDK, Inc.", "A2", 5, 18, 9);
		myOrder.addOrder(2569, "SMH Inc.", "A1", 6, 12, 1);
		myOrder.addOrder(2362, "Something Inc", "C2", 8, 18, 7);
		myOrder.addOrder(8192, "Alphabet, Inc.", "E2", 7, 12, 1, 2, 6, 27);
		myOrder.addOrder(7623, "Idk, Inc.", "B2", 9, 12, 5, 2, 8, 27);
		myOrder.addOrder(9109, "Alphabet, Inc.", "A2", 5, 18, 9);
		myOrder.addOrder(2569, "Alphabet, Inc.", "A1", 3, 12, 1);
		myOrder.addOrder(2362, "Something Inc", "C2", 11, 18, 7);
		myOrder.addOrder(8192, "Alphabet, Inc.", "E2", 7, 12, 1, 2, 6, 27);
		myOrder.addOrder(7623, "Idk, Inc.", "B2", 12, 12, 5, 2, 8, 27);
		myOrder.addOrder(9109, "Alphabet, Inc.", "A2", 3, 18, 9);
										
		myOrder.printReport();
								
	}

}