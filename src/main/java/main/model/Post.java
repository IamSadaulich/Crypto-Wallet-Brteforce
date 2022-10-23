package main.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "posts")
public class Post extends BaseEntity{
    @Column(name = "is_active", columnDefinition = "TINYINT", nullable = false)
    private boolean isActive;

    @Column(name = "moderation_status", nullable = false, columnDefinition = "enum")
    @Enumerated(EnumType.STRING)
    private ModerationStatus moderationStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    private User moderator;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private User user;

    @Column(nullable = false)
    private Date time;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;

    @Column(name = "view_count", nullable = false)
    private int viewCount;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tag2post",
    joinColumns = {@JoinColumn(name = "post_id")},
    inverseJoinColumns = {@JoinColumn(name = "tag_id")})
    private List<Tag> tags = new ArrayList<>();
}
