package com.medicine.medicineserver.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "user")
@DynamicInsert
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private int id;

    @Column(name = "name")
    private  String name;

    @Column(name = "password")
    private  String password;

}
