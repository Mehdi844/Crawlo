package com.example.crawlov2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int account_id;
    public String Region;
    public String Default_website;
    public String Websites;
    public String Components;
    public boolean Sales;
    public boolean IsActive;

    @OneToMany (mappedBy = "account")
    private Set<Access> accesses = new HashSet<>();
}
