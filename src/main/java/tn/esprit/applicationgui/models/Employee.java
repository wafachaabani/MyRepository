package tn.esprit.applicationgui.models;

public class Employee {
    public int id_employee;
    public String nom;
    public String prenom;
    public String poste;
    public int diponibilite;

    public Employee(int id_employee, String nom, String prenom, String poste, int diponibilite) {
        this.id_employee = id_employee;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.diponibilite = diponibilite;
    }

    public Employee(String nom, String prenom, String poste, int diponibilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.diponibilite = diponibilite;
    }

    public int getId_employee() {
        return id_employee;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPoste() {
        return poste;
    }

    public int getDiponibilite() {
        return diponibilite;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setDiponibilite(int diponibilite) {
        this.diponibilite = diponibilite;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id_employee=" + id_employee +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", poste='" + poste + '\'' +
                ", diponibilite='" + diponibilite + '\'' +
                '}';
    }
}
