package it.ow.stage.service;

import it.ow.stage.model.Employer;
import it.ow.stage.service.exception.EmployerManagerException;

/**
 * Created by francesco on 29/04/15.
 */
public interface EmployerManager {
    void createEmployer() throws EmployerManagerException;
    void deleteEmployer() throws EmployerManagerException;
    void modifyEmployer() throws EmployerManagerException;
    void findOne() throws EmployerManagerException;
    void findAll() throws EmployerManagerException;
}
