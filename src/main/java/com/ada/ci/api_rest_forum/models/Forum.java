package com.ada.ci.api_rest_forum.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Entity
@Setter
@Table(name = "forum")
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idForum;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description",nullable = false )
    private String description;

    @Column(name = "createdDate",nullable = false)
    private Instant createdDate;

    @Column(unique = true)
    private String slug;



}
