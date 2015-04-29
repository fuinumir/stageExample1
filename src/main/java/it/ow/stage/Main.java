package it.ow.stage;

import it.ow.stage.service.EmployerManager;
import it.ow.stage.service.exception.EmployerManagerException;
import it.ow.stage.service.impl.EmployerManagerImpl;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

/**
 * Created by francesco on 29/04/15.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployerManager employerManager = new EmployerManagerImpl();
        Integer choice = null;
        do {
            System.out.println();
            System.out.println();
            System.out.println("1: Create employer");
            System.out.println("2: Delete employer");
            System.out.println("3: Search employer");
            System.out.println("4: Modify employer");
            System.out.println("5: List all employers");
            System.out.println("---------------------");
            System.out.println("0: Quit");
            System.out.println();
            System.out.println("Please make a choice: ");
            String choiceString = scanner.nextLine();
            try {
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice");
                continue;
            }
            try {
                switch (choice) {
                    case 1:
                        employerManager.createEmployer();
                        break;
                    case 2:
                        employerManager.deleteEmployer();
                        break;
                    case 3:
                        employerManager.findOne();
                        break;
                    case 4:
                        employerManager.modifyEmployer();
                        break;
                    case 5:
                        employerManager.findAll();
                        break;

                }
            } catch (EmployerManagerException e) {
                e.printStackTrace();
            }
        } while (choice != 0);
        System.out.println("Bye");

        // close the scanner
        scanner.close();
    }
}
