package com.dailycodework.dreamshops.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Role(String name){
        this.name=name;
    }

    @ManyToMany(mappedBy="roles")
    private Collection<User>users=new HashSet<>();

}
