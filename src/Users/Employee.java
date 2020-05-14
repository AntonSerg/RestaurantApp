/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Anton
 */
public class Employee {
    private int id;
    private String Username;
    private String Password;
    private String Name;
    private String Surname;
    private String SecQ;
    private String Answer;
    private int EmpPos;
    private int Permission;
    
    public String getOrderSign()
    {
        String sign = id + ". Employee:" + Name + " " + Surname + " (Username:" + Username + ")\n";
        return sign;
    }
    
    public String getInfo()
    {
        String info = "id: " + id + "\nUsername: " + Username +
                "\nName: " + Name + "\nSurnane: " + Surname;
        return info;
    }
    
    public Employee(String Username, String Password, String Name, String Surname, String SecQ, String Answer
    , int EmpPos, int Permission)
    {
        id = 0;
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Surname = Surname;
        this.SecQ = SecQ;
        this.Answer = Answer;
        this.EmpPos = EmpPos;
        this.Permission = Permission;
    }
    public Employee(String Username, String Password, String Name, String Surname, String SecQ, String Answer
    , int EmpPos)
    {
        id = 0;
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Surname = Surname;
        this.SecQ = SecQ;
        this.Answer = Answer;
        this.EmpPos = EmpPos;
        this.Permission = 0;
    }
    public Employee(int id, String Username, String Password, String Name, String Surname, String SecQ, String Answer
    , int EmpPos, int Permission)
    {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Surname = Surname;
        this.SecQ = SecQ;
        this.Answer = Answer;
        this.EmpPos = EmpPos;
        this.Permission = Permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getSecQ() {
        return SecQ;
    }

    public void setSecQ(String SecQ) {
        this.SecQ = SecQ;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public int getEmpPos() {
        return EmpPos;
    }

    public void setEmpPos(int EmpPos) {
        this.EmpPos = EmpPos;
    }

    public int getPermission() {
        return Permission;
    }

    public void setPermission(int Permission) {
        this.Permission = Permission;
    }
    
}
