package com.ada.ci.api_rest_forum.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;

    @Column(name = "content",nullable = false)
    private String content;

    @Column(name = "createdDate",nullable = false)
    private Instant createdDate;

    @Column(unique = true)
    private String slug;
}
