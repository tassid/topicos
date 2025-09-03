package br.edu.utfpr.apiaula.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

    @Getter
    @Setter
    @ToString
    @Entity
    @Table(name = "tb_person")
    // @NoArgsConstructor
    // @AllArgsConstructor
    // @Data

public class Person {

    @Id
    private UUID id = UUID.randomUUID();

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;


}
