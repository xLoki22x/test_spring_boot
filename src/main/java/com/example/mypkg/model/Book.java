package com.example.mypkg.model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book{
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private LocalDate publishedDate;
		
    
    public Book() {
		}
	
		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public String gettitle() {
			return this.title;
		}

		public void settitle(String title) {
			this.title = title;
		}
	
		public String getauthor() {
			return this.author;
		}

		public void setauthor(String author) {
			this.author = author;
		}
		
		public String getisbn(){
			return this.isbn;
		}

		public void setisbn(String isbn) {
			this.isbn = isbn ;
		}
		
		public LocalDate getpublishedDate (){
			return this.publishedDate;
		}

		public void setpublishedDate (LocalDate publishedDate ) {
			this.publishedDate  = publishedDate  ;
		}
}
