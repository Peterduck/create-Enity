package com.example.createEnity.Models;

import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="categories")
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long category_id;

    @Column
    private String category_name;

    @OneToMany()
    private List<Product> products = new ArrayList<>();
}
