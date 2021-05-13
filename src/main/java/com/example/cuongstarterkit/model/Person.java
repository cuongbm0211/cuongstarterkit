package com.example.cuongstarterkit.model;

import com.example.cuongstarterkit.model.entity.jpa.BaseEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity(name = "person")
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Person extends BaseEntity {

    String name;
}
