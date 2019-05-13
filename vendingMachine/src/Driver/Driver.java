package Driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

import AbstractFactory.*;
import DataStore.*;
import InputProcessor.*;
import MDAEFSM.*;
import OutputProcessor.*;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		int choice = 1;

		System.out.println(" ******** Select Vending Machine *******");
		System.out.println("          1.Vending Machine - 1");
		System.out.println("          2.Vending Machine - 2");

		input = bufferedReader.readLine();
		if (input.equalsIgnoreCase("1")) {
			// Create GasPump1Factory, DataStore, OutputProcessor, MDAEFSM and GasPump1
			// objects
			AbstractFactory af = new vendingMachine1Factory();
			DataStore ds = af.getDataStore();
			OutputProcessor op = new OutputProcessor(af, ds);
			MDAEFSM mda = new MDAEFSM(op);
			vendingMachine1 vm1 = new vendingMachine1(mda, ds);

			System.out.println("*************************************");
			System.out.println("          Vending Machine-1");
			System.out.println("          MENU of Operations");
			System.out.println("          0. create(int)");
			System.out.println("          1. coin(int)");
			System.out.println("          2. sugar()");
			System.out.println("          3. tea()");
			System.out.println("          4. chocolate()");
			System.out.println("          5. insert_cups(int)");
			System.out.println("          6. set_price(int)");
			System.out.println("          7. cancel()");
			System.out.println("          8. card(float)");
			System.out.println("          q. Quit");
			System.out.println("  Please make a note of these operations");
			System.out.println("           Vending Machine-1 Execution");

			while (true) {

				System.out.println("  Select Operation: ");
				System.out.println("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card,q-Quit");

				input = bufferedReader.readLine();

				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;

				choice = Integer.parseInt(input);

				System.out.println(
						"0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card,q-Quit");

				switch (choice) {
				case 0: // create(int)
					int p;
					System.out.println("\n  create(int p)");
					System.out.println("   Enter value of p:");
					p = in.nextInt();
					vm1.create(p);
					break;

				case 1: // Coin()
					System.out.println("\n  Operation:  coin(int v)");
					int v = in.nextInt();
					vm1.coin(v);
					break;

				case 2: // Sugar()
					System.out.println("\n  Operation:  sugar()");
					vm1.sugar();
					break;

				case 3: // Tea()
					System.out.println("\n  Operation:  tea()");
					vm1.tea();
					break;

				case 4: // chocolate()
					System.out.println("\n  Operation:  Chocolate()");
					vm1.chocolate();
					break;

				case 5: // inset_cups(int)
					System.out.println("\n  Operation:  insert_cups(int n)");
					System.out.println("   Enter value of n:");
					int n = in.nextInt();
					vm1.insert_cups(n);
					break;

				case 6: // set_price(int)
					System.out.println("\n  Operation:  set_price(int p)");
					System.out.println("   Enter value of p:");
					int p1 = in.nextInt();
					vm1.set_price(p1);
					break;

				case 7: // cancel()
					System.out.println("\n  Operation:  cancel()");
					vm1.cancel();
					break;

				case 8: // card(float)
					System.out.println("\n  Operation:  card(float x)");
					System.out.println("   Enter value of x:");
					float x = in.nextFloat();
					vm1.card(x);
					break;

				case 'q':
					System.exit(0);
					// break;

				default: // Invalid choice
					System.out.println("Invalid Choice");
					break;

				}

			}
		} else if (input.equalsIgnoreCase("2")) {
			// Create GasPump2Factory, DataStore, OutputProcessor, MDAEFSM and GasPump2
			// objects
			AbstractFactory af = new vendingMachine2Factory();
			DataStore ds = af.getDataStore();
			OutputProcessor op = new OutputProcessor(af, ds);
			MDAEFSM mda = new MDAEFSM(op);
			vendingMachine2 vm2 = new vendingMachine2(mda, ds);

			System.out.println("*************************************");
			System.out.println("          Vending Machine-2");
			System.out.println("          MENU of Operations");
			System.out.println("          0. CREATE(float)");
			System.out.println("          1. COIN(float)");
			System.out.println("          2. SUGAR()");
			System.out.println("          3. CREAM()");
			System.out.println("          4. COFFEE()");
			System.out.println("          5. InsertCups(int)");
			System.out.println("          6. SetPrice(int)");
			System.out.println("          7. CANCEL()");
			System.out.println("          q. Quit");
			System.out.println("  Please make a note of these operations");
			System.out.println("           Vending Machine-2 Execution");


			while (true) {
				System.out.println("  Select Operation: ");
				System.out.println("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL,q-Quit");

				input = bufferedReader.readLine();

				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;

				choice = Integer.parseInt(input);

				System.out.println("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL,q-Quit");
				
				switch (choice) {
				
				case 0:
					System.out.println("\n  CREATE(float p)");
					System.out.println("   Enter value of p:");
					float p = in.nextFloat();
					vm2.CREATE(p);
					break;

				case 1: // Coin()
					System.out.println("\n  Operation:  COIN(float v)");
					float v = in.nextFloat();
					vm2.COIN(v);
					break;

				case 2: // Sugar()
					System.out.println("\n  Operation:  SUGAR()");
					vm2.SUGAR();
					break;

				case 3: // Tea()
					System.out.println("\n  Operation:  CREAM()");
					vm2.CREAM();
					break;

				case 4: // chocolate()
					System.out.println("\n  Operation:  COFFEE()");
					vm2.COFFEE();
					break;

				case 5: // inset_cups(int)
					System.out.println("\n  Operation:  InsertCups(int n)");
					System.out.println("   Enter value of n:");
					int n = in.nextInt();
					vm2.InsertCups(n);
					break;

				case 6: // set_price(int)
					System.out.println("\n  Operation:  SetPrice(float p)");
					System.out.println("   Enter value of p:");
					float p1 = in.nextFloat();
					vm2.SetPrice(p1);
					break;

				case 7: // cancel()
					System.out.println("\n  Operation:  CANCEL()");
					vm2.CANCEL();
					break;

				case 'q':
					System.exit(0);
					// break;
					
				default: // Invalid choice
					System.out.println("Invalid Choice");
					break;
				

				}
			}

		} else {
			System.out.println("Invalid Choice");
		}
		in.close();
	}

}