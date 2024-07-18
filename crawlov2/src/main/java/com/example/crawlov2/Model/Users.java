package com.example.crawlov2.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int user_id;
    public String FirstName;
    public String LastName;
    public String Email;
    public String Password;
    public String Account;
    public boolean IsActive;

    @OneToMany (mappedBy = "user")
    private Set<Access> accesses = new HashSet<>();


}
