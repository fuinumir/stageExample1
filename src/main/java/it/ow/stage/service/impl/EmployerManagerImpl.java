package it.ow.stage.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import it.ow.stage.model.Employer;
import it.ow.stage.service.EmployerManager;
import it.ow.stage.service.exception.EmployerManagerException;

/**
 * Created by francesco on 29/04/15.
 */
public class EmployerManagerImpl implements EmployerManager {

    private Map<Long, Employer> employerMap;
    private Long counter;

    public EmployerManagerImpl() {
        employerMap = new HashMap<>();
        counter = 1L;
    }

    @Override
    public void createEmployer() throws EmployerManagerException {
        createEmployer(counter++);
    }


    private void createEmployer(Long anId) throws EmployerManagerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstname = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastname = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("Telephone: ");
        String telephone = scanner.nextLine();
        employerMap.put(anId, new Employer(firstname, lastname, address, telephone));
        System.out.println("Employer create successfully!!!!");
        findAll();
    }

    @Override
    public void deleteEmployer() throws EmployerManagerException {
        for (Map.Entry<Long, Employer> longEmployerEntry : employerMap.entrySet()) {
            System.out.println(longEmployerEntry.getKey() + ") " + longEmployerEntry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select employer id to delete: ");
        String employerIdString = scanner.nextLine();

        try {
            Long employerId = Long.parseLong(employerIdString);
            Employer removed = employerMap.remove(employerId);
            if (removed == null) {
                System.out.println("Employer with id " + employerId + " does'nt exist, nothing is changed");
            }
            findAll();
        } catch (NumberFormatException e) {
            System.out.println("Invalid employerId");
        }
    }

    @Override
    public void modifyEmployer() throws EmployerManagerException {
        for (Map.Entry<Long, Employer> longEmployerEntry : employerMap.entrySet()) {
            System.out.println(longEmployerEntry.getKey() + ") " + longEmployerEntry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select employer id to modify: ");
        String employerIdString = scanner.nextLine();

        try {
            Long employerId = Long.parseLong(employerIdString);
            Employer employer = employerMap.get(employerId);
            if (employer == null) {
                System.out.println("Employer with id " + employerId + " not found");
            } else {
                createEmployer(employerId);
                findAll();
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid employerId");
        }
    }

    @Override
    public void findOne() throws EmployerManagerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select employer id to find: ");
        String employerIdString = scanner.nextLine();
        try {
            Long employerId = Long.parseLong(employerIdString);
            Employer employer = employerMap.get(employerId);
            if (employer == null) {
                System.out.println("Employer with id " + employerId + " not found");
            } else {
                System.out.println(employer);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid employerId");
        }

    }

    @Override
    public void findAll() throws EmployerManagerException {
        System.out.println("EMPLOYER LIST");
        for (Employer employer : employerMap.values()) {
            System.out.println(employer);
        }
    }
}
