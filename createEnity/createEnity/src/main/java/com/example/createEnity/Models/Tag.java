package com.example.createEnity.Models;

import java.util.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tags")
public class Tag {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tag_id;

    @Column(nullable = false)
    private String tag_name;

    @ManyToMany(mappedBy = "tags", cascade = CascadeType.ALL)
    private List<Product> products;
}
