package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baransonmez
 */
public abstract class AUser {
    
    private String name;
    private String surname;
    private String userName;
    private String password;

    public AUser(String name, String surname, String userName, String password) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
    }
    
}
