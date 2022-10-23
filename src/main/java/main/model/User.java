package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(name = "is_moderator", columnDefinition = "TINYINT", nullable = false)
    private boolean isModerator;

    @Column(name = "reg_time", nullable = false)
    private Date regTime;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String code;

    @Column(columnDefinition = "TEXT")
    private String photo;
}
