package model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    private String name;
    private String roles;
    private String contactInfo;
    private String email;
    private String username;
    private String password;
    
    @OneToMany(mappedBy = "farmer")
    private Set<Farm> farms;
    
    @OneToMany(mappedBy = "farmer")
    private Set<Loan> loans;
    
    @OneToMany(mappedBy = "admin")
    private Set<Loan> approvedLoans;
    
    @OneToMany(mappedBy = "buyer")
    private Set<Transactions> transactions;

    public User() {
    }

    public User(Long userId) {
        this.userId = userId;
    }

    public User(Long userId, String name, String roles, String contactInfo, String email, String username, String password, Set<Farm> farms, Set<Loan> loans, Set<Loan> approvedLoans, Set<Transactions> transactions) {
        this.userId = userId;
        this.name = name;
        this.roles = roles;
        this.contactInfo = contactInfo;
        this.email = email;
        this.username = username;
        this.password = password;
        this.farms = farms;
        this.loans = loans;
        this.approvedLoans = approvedLoans;
        this.transactions = transactions;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Set<Farm> getFarms() {
        return farms;
    }

    public void setFarms(Set<Farm> farms) {
        this.farms = farms;
    }

    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }

    public Set<Loan> getApprovedLoans() {
        return approvedLoans;
    }

    public void setApprovedLoans(Set<Loan> approvedLoans) {
        this.approvedLoans = approvedLoans;
    }

    public Set<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transactions> transactions) {
        this.transactions = transactions;
    }
}
