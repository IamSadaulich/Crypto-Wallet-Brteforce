package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_votes")
public class PostVote extends BaseEntity{
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Post post;

    @Column(nullable = false)
    private Date time;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private int value;
}
