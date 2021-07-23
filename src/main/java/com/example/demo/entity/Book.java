package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	@SequenceGenerator(name = "book_seq", allocationSize = 1,sequenceName = "book_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
private Long bookId;
private String bookName;

}
