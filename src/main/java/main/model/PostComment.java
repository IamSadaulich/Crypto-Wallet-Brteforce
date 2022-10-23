package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComment extends BaseEntity {
    @ManyToOne(cascade = CascadeType.ALL)
    private PostComment parent;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Post post;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private User user;

    @Column(nullable = false)
    private Date time;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String text;
}
