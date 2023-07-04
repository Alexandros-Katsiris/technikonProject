package com.example.technikonproject.domain.subDomain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class RepairType {

    @Id
    @SequenceGenerator(name = "repairTypeGenerator", sequenceName = "repairTypeGenerator", allocationSize = 1)
    @GeneratedValue(generator = "repairTypeGenerator", strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String repairType;
}