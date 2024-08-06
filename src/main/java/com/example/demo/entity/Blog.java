package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Blog {
    @Id
    private int id;
    private String title;
    private String text;
    private String category;
}
