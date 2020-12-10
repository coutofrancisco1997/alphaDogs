package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.User;

/**
 * Common interface for authentication services, provides methods
 * for customer authentication and authorization
 */
public interface AuthService {

    /**
     * Authenticates the accessing customer
     *
     *
     * @return {@code true} if authentication was successful
     */
    boolean authenticate(Integer id, String password);

    /**
     * Gets the accessing customer
     *
     * @return the customer
     */
    User getAccessingUser();
}
