/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Users.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anton
 */
public class EmployeeDao implements Dao<Employee> {
    
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public EmployeeDao() {
        conn = DBConnect.ConnectDB();
    }
    public void ConnectionClose()
    {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Employee get(String UserName, String Password)
    {
        String query = "SELECT * FROM Employee WHERE Username = ? AND Password = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, UserName);
            pst.setString(2, Password);
            rs = pst.executeQuery();
            if(rs.next()){
                try
                {
                    Employee getEmp = new Employee(Integer.parseInt(rs.getString("id")),rs.getString("Username")
                ,rs.getString("Password"), rs.getString("Name"), rs.getString("Surname")
                ,rs.getString("SecQ"),rs.getString("Answer"), Integer.parseInt(rs.getString("EmpPos"))
                , Integer.parseInt(rs.getString("Permission")));
                
                    return getEmp;
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrent username/password");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public Employee get(String UserName)
    {
        String query = "SELECT * FROM Employee WHERE Username = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, UserName);
            rs = pst.executeQuery();
            if(rs.next()){
                try
                {
                    Employee getEmp = new Employee(Integer.parseInt(rs.getString("id")),rs.getString("Username")
                ,rs.getString("Password"), rs.getString("Name"), rs.getString("Surname")
                ,rs.getString("SecQ"),rs.getString("Answer"), Integer.parseInt(rs.getString("EmpPos"))
                , Integer.parseInt(rs.getString("Permission")));
                
                    return getEmp;
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrent username");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    @Override
    public void save(Employee t) {
        try{
            String query = "INSERT INTO Employee (Username, Password, Name, Surname, SecQ, Answer, EmpPos) VALUES (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, t.getUsername());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getName());
            pst.setString(4, t.getSurname());
            pst.setString(5, t.getSecQ());
            pst.setString(6, t.getAnswer());
            pst.setInt(7, t.getEmpPos());
            pst.execute();
            JOptionPane.showMessageDialog(null, "New employee addeed");

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }

    @Override
    public void update(Employee t, String[] params) {
    String query = "UPDATE Employee SET Password = ? WHERE Answer=? AND Username = ?";
        try{ 
            pst = conn.prepareStatement(query);
            pst.setString(1,params[0]);
            pst.setString(2,params[1]);
            pst.setString(3,t.getUsername());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updating, try to login(If not - answer wrong)");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void remove(Employee t) {

    }
    
}
