package SpringApp.model;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Basic(optional = false)
    @Column(nullable = false)
    private String firstMidName;

    @Basic(optional = false)
    @Column(nullable = false)
    private String lastName;

    @Basic(optional = false)
    @Column(nullable = false)
    private String username;

    @Basic(optional = false)
    @Column(nullable = false)
    private String password;


    protected Admin(){}

    public Admin(String firstMidName, String lastName, String username, String password) {
        this.firstMidName = firstMidName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "Admin[id=%d, firstMidName='%s', lastName='%s']",
                id, firstMidName, lastName);
    }

    public Integer getId() {
        return id;
    }

    public String getFirstMidName() {
        return firstMidName;
    }

    public void setFirstMidName(String firstMidName) {
        this.firstMidName = firstMidName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
