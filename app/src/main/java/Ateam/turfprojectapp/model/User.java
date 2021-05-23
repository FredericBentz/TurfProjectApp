package Ateam.turfprojectapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


/**
 * Created by Frederic on 23/05/2021.
 */
@Entity(tableName = "user", indices = { @Index(value = {"pseudo"}, unique = true) })
public class User {
    //VAR
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    private String pseudo;
    private String password;


    //CONSTRUCTOR
    public User() {}

    public User(int id, String firstName, String lastName, String pseudo, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudo = pseudo;
        this.password = password;
    }

    public User(String firstName, String lastName, String pseudo, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudo = pseudo;
        this.password = password;
    }

    //METHODE


    //SET
    public void setId(int id) { this.id = id; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //GET
    public int getId() { return id; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPassword() {
        return password;
    }
}
