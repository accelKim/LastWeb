package com.example.lastweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminPunding {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer punding_id;

  @Column(name = "title")
  private String title;

  @Column(name = "content")
  private String content;

  @Column(name = "start")
  private String start;

  @Column(name = "end")
  private String end;

  @Column(name = "likes")
  private Integer likes;

  @Column(name = "status")
  private boolean status;

  @Column(name = "image")
  private String image;

  @Column(name = "image2")
  private String image2;

  @Column(name = "category")
  private Integer category;

  @Column(name = "create_at")
  private String create_at;

  @Column(name = "modified_at")
  private String modified_at;

  @Column(name = "colleting")
  private Integer colleting;



}
