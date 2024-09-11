package com.ada.ci.api_rest_forum.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
@Table(name = "sujet")
public class Sujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSujet;

    @Column(name = "title",nullable = false)
    private String title;

    @ManyToMany
    @JoinColumn(name = "idForum")
    private Forum forum;

    @OneToMany
    @JoinColumn(name = "idMessage")
    private Message message;

    @Column(unique = true)
    private String slug;
}
