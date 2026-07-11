package com.hei.demo.repository.entity;

import com.hei.demo.PojaGenerated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@PojaGenerated
@Entity
@Getter
@Setter
public class Dummy {
    @Id private String id;

}
