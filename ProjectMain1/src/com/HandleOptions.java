package com;
import java.util.List;
import java.util.Scanner;
public class HandleOptions {
		public static void handleWelcomeScreenInput() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.displayMenu();
					int input = sc.nextInt();

					switch (input) {
					case 1:
						FileOperations.displayAllFiles("main");
						break;
					case 2:
						HandleOptions.handleFileMenuOptions();
						break;
					case 3:
						System.out.println(" The program has been exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Would request you to select the appropriate options from given above.......");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					handleWelcomeScreenInput();
				} 
			} while (running == true);
		}

		public static void handleFileMenuOptions() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.displayFileMenuOptions();
					FileOperations.createMainFolderIfNotPresent("main");
					
					int input = sc.nextInt();
					switch (input) {
					case 1:
						// file add to the main folder.
						System.out.println("Enter the name of the file to be added to the \"main\" folder");
						String fileToAdd = sc.next();
						
						FileOperations.createFile(fileToAdd, sc);
						
						break;
					case 2:
						// File which is to be deleted from the main folder.
						System.out.println("Enter the name of the file you want to delete from \"main\" folder");
						String fileToDelete = sc.next();
						
						FileOperations.createMainFolderIfNotPresent("main");
						List<String> filesToDelete = FileOperations.displayFileLocations(fileToDelete, "main");
						
						String deletionPrompt = "\nSelect index of which ever  file to delete?"
								+ "\n(Enter 0 if you want to delete all the elements)";
						System.out.println(deletionPrompt);
					
						int idx = sc.nextInt();
						
						if (idx != 0) {
							FileOperations.deleteFileRecursively(filesToDelete.get(idx - 1));
						} else {
							
							// If idx == 0, delete all the  files displayed for the name.
							for (String path : filesToDelete) {
								FileOperations.deleteFileRecursively(path);
							}
						}
						

						break;
					case 3:
						// File to be searched from main folder.
						System.out.println("Enter the name of the file to be searched from \"main\" folder");
						String fileName = sc.next();
						
						FileOperations.createMainFolderIfNotPresent("main");
						FileOperations.displayFileLocations(fileName, "main");

						
						break;
					case 4:
						// Go to Previous menu
						return;
					case 5:
						// Exit
						System.out.println(" The program has been exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					handleFileMenuOptions();
				}
			} while (running == true);
		}
	}
	