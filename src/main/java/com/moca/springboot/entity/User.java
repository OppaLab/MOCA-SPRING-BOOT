package com.moca.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long userId;
    private String nickname;
    private String email;

    private LocalDateTime createdAt;
    private float userSentimentScore;

    @OneToMany(mappedBy = "user")
    private List<UserCategory> userCategories;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(mappedBy = "user")
    private List<UserEntity> userEntities;

    @OneToMany(mappedBy = "user")
    private List<Feed> feeds;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToMany(mappedBy = "user")
    private List<Like> likes;

}