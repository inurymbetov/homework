package com.homework.homework;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "WORDS")
public class Word{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String value;

}
