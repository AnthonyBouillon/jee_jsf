package com.objis.demojsf.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

// Linked to the register page
@ManagedBean(name = "userbean")
public class UserBean {

    // Attributs
    @ManagedProperty(name = "prenom", value = "MICHEL")
    private String prenom;
    @ManagedProperty(name = "nom", value = "DUPOND")
    private String nom;
    @ManagedProperty(name = "genre", value = "homme")
    private String genre;
    private Date datedenaissance;
    @ManagedProperty(name = "email", value = "participant@objis.com")
    private String email;
    private String niveaudeservice;

    // Creating a list containing 4 users
    private static final List<User> userList = new ArrayList<User>(
            Arrays.asList(
                    new User("Dupont", "Michel", "homme", "dupont@objis.com", "medium"),
                    new User("Paulin", "Jacques", "homme", "paulin@objis.com", "medium"),
                    new User("Participant", "Objis", "homme", "particpany@objis.com", "medium"),
                    new User("Nathalie", "Tango", "femme", "nathalie@objis.com", "premium")
            )
    );

    // Display the user list
    public List<User> getUserList() {
        return userList;
    }
    // Removes a user from the list

    public void deleteAction(User user) {
        userList.remove(user);
    }

    //
    // Getters and Setters
    //
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDatedenaissance() {
        return datedenaissance;
    }

    public void setDatedenaissance(Date datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNiveaudeservice() {
        return niveaudeservice;
    }

    public void setNiveaudeservice(String niveaudeservice) {
        this.niveaudeservice = niveaudeservice;
    }

}
