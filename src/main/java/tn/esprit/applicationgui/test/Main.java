package tn.esprit.applicationgui.test;

import tn.esprit.applicationgui.models.Employee;
import tn.esprit.applicationgui.services.EmployeeService;
import tn.esprit.applicationgui.utils.MyDatabase;

import java.sql.SQLException;

public class Main {
    public static void main (String[] args){
//        MyDatabase db = MyDatabase.getInstance();
//        MyDatabase db2 = MyDatabase.getInstance();
//
//        System.out.println(db);
//        System.out.println(db2);


        EmployeeService ps =new EmployeeService();

//        try {
//            ps.ajouter(new Employee("wafa",  "chaabani",  "pilote",  1));
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }


        try {
            ps.modifier(new Employee(1,"wefe",  "chaabani",  "pilote",  1));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
