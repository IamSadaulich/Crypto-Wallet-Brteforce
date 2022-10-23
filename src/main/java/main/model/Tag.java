package main.model;

import javax.persistence.*;

@Entity
@Table(name = "tags")
public class Tag extends BaseEntity {
    @Column(nullable = false)
    private String name;
}
