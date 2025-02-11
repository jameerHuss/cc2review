package com.example.fashoin.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fashion 
{
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dresscode;
    private String typeofdress;
    private String size;
    private int count;
    private String typesoffabric;
   
    @OneToOne
    private Customer customer;



   //  @ManyToOne
     //@JsonBackReference
    // private Customer customer1;
}
    


