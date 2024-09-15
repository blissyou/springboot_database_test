package org.example.memorydatabase.entity;

import lombok.Data;

@Data
public abstract class entity implements PrimaryKey {
    private Long id;
}
