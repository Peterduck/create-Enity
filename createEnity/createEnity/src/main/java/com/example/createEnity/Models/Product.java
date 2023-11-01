package com.example.createEnity.Models;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
@Table (name="products")
public class Product {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long product_id;

    @Column(nullable = false)
    private String product_name;

    @Column(nullable = false)
    private String price;

    @Column
    private String describe;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "product_tag",
        joinColumns = @JoinColumn(name ="product_id", referencedColumnName = "product_id"),
        inverseJoinColumns = @JoinColumn(name="tag_id", referencedColumnName = "tag_id")
    )
    private List<Tag> tags = new ArrayList<>();
 
}
