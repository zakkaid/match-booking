package com.example.MatchBooking.domain;

import com.example.MatchBooking.command.FieldTypeCommand;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class FieldType extends BaseEntity{
    @Column
    private String name;
    @Column
    private int capacity;
    @Column
    private float price;
    @OneToMany(mappedBy = "fieldType")
    private List<Field> field;

    public FieldType createFieldType(FieldTypeCommand fieldTypeCommand){
        FieldType fieldType = new FieldType();
        fieldType.name = fieldTypeCommand.getName();
        fieldType.capacity = fieldTypeCommand.getCapacity();
        fieldType.price = fieldTypeCommand.getPrice();
        return fieldType;
    }
}
