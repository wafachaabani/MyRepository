package tn.esprit.applicationgui.services;

import tn.esprit.applicationgui.models.Employee;
import tn.esprit.applicationgui.utils.MyDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeService implements IService<Employee> {

    private Connection connection;

    public EmployeeService(){
        connection = MyDatabase.getInstance().getConnection();

    }


    @Override
    public void ajouter(Employee employee) throws SQLException {
        String req = "INSERT INTO employee (nom, prenom, poste, disponibilite) VALUES('"+employee.getNom()+"', '"+employee.getPrenom()+"' ,'"+employee.getPoste()+"' ,"+employee.getDiponibilite()+")";
        Statement st = connection.createStatement();
        st.executeUpdate(req);
    }

    @Override
    public void modifier(Employee employee) throws SQLException {
        String req = "UPDATE employee SET nom = ? ,prenom = ?, poste = ?, disponibilite = ? WHERE id_employee =?";
        PreparedStatement ps =connection.prepareStatement(req);
        ps.setString(1, employee.getNom());
        ps.setString(2, employee.getPrenom());
        ps.setString(3, employee.getPoste());
        ps.setInt(4, employee.getDiponibilite());
        ps.setInt(5, employee.getId_employee());
        ps.executeUpdate();
    }

    @Override
    public void supprimer(int id) {

    }

    @Override
    public List<Employee> recuperer() {
        return null;
    }
}
