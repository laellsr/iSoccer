package iSoccer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Person> person = new ArrayList<Person>();
		boolean active = true, case1;
		int index, decision, decision2, decision3, decision4; double value;
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
											President president = new President();
											president.setPresident();
											person.add(president);
											break;
										case 2:
											Doctor doctor = new Doctor();
											doctor.setDoctor();
											person.add(doctor);
											break;
										case 3:
											Coach coach = new Coach();
											coach.setCoach();
											person.add(coach);
											break;
										case 4:
											Trainer trainer = new Trainer();
											trainer.setTrainer();
											person.add(trainer);
											break;
										case 5:
											Driver driver = new Driver();
											driver.setDriver();
											person.add(driver);
											break;
										case 6:
											Cooker cooker = new Cooker();
											cooker.setCoocker();
											person.add(cooker);
											break;
										case 7:
											Lawyer lawyer = new Lawyer();
											lawyer.setLawyer();
											person.add(lawyer);
											break;
										case 8:
											Player player = new Player();
											player.setPlayer();
											person.add(player);
											break;
										default:
											System.out.printf("Opcao invalida!\n");
											break;
									}
									break;
								case 2:
									PartnerSupporter partnerSupporter = new PartnerSupporter();
									partnerSupporter.setPartner();
									person.add(partnerSupporter);
									break;
								case 3:
									Menu.partnerMenu();
									decision3 = input.nextInt(); input.nextLine();
									switch (decision3)
									{
										case 1:
											showPartner(person);
											index = input.nextInt(); input.nextLine();
											if (person.get(index).getClass().getSimpleName().intern()=="PartnerSupporter")
												person.get(index).setStatus();
													//System.out.println(person.get(index).getStatus());	
											break;
										case 2:
											
											for (int i = 1; i < 4; i++) 
											{
												System.out.printf("Digite um novo valor para a categoria [%d]", i);
												if(i==1)
													System.out.printf("Junior:\n=> ");
												else if (i==2)
													System.out.printf("Senior:\n=> ");
												else
													System.out.printf("Elite:\n=> ");
												value = input.nextDouble(); input.nextLine();
												for (int j = 0; j < person.size(); j++) 
												{
													if (person.get(j).getClass().getSimpleName().intern()=="PartnerSupporter" && person.get(j).getType()==i)
														person.get(j).setSupportvalue(value);
												}
											}
											break;
										default:
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
	
	static public void showPartner(ArrayList<Person> person)
	{
		System.out.printf("Escolha o socio-torcedor:\n");
		for(int i = 0; i < person.size(); i++)
			if (person.get(i).getClass().getSimpleName().intern()=="PartnerSupporter")
				System.out.printf("[%d] %s\n", i, person.get(i).getName());
		System.out.printf("=> ");
	}

}
