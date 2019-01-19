package iSoccer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Person> person = new ArrayList<Person>();
		boolean active = true, case1;
		int decision, decision2, decision3;
		String string1, string2;
		
		while(active)
		{
			Menu.startMenu();
			decision = input.nextInt(); input.nextLine();
			
			switch (decision)
			{
				case 1:
					System.out.printf("Usuario:\n=> ");
					string1 = input.nextLine();
					System.out.printf("Senha:\n=> ");
					string2 = input.nextLine();
					if (string1.intern()=="admin" && string2.intern()=="admin")
					{
						case1 = true;
						while(case1)
						{
							Menu.mainMenu();
							decision2 = input.nextInt(); input.nextLine();
							switch (decision2)
							{
								case 1:
									Menu.employeeMenu();
									decision3 = input.nextInt(); input.nextLine();
									switch (decision3)
									{
										case 1:
											President presidente = new President();
											presidente.setPresident();
											System.out.printlf("\n");
											break;
										case 2:
											Doctor
	
										default:
											System.out.printf("Opcao invalida!\n");
											break;
									}
									break;
									
								case 0:
									case1 = false;
									break;
	
								default:
									break;
							}
						}
					}
					break;
				
				case 0:
					active = false;
					break;
					
				default:
					break;
			}
		}
		input.close();
	}

}
