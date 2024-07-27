package com.example.mypkg.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mypkg.Service.BookService;
import com.example.mypkg.model.Book;

@RestController
@RequestMapping("/api/books/")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    
	    @GetMapping("GET/books")
	    public List<Book> getAllBooks() {
	        return bookService.getAllBooks();
	    }

	    @GetMapping(value = "GET/books/{id}")
	    public Book getBookById(@PathVariable("id") Long id) {
	        return bookService.getBookById(id);	    
	    }

	    @PostMapping("POST/books")
	    public Book addBook(@RequestBody Book book) {
	    	book.setpublishedDate(LocalDate.now());
	        return bookService.addBook(book);
	    }

	    @PutMapping("PUT/books/{id}")
	    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book bookDetails) {
	        return bookService.updateBook(id ,bookDetails);
	    }

	    @DeleteMapping("Delete/books/{id}")
	    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
	            String magerror ="";
	    		String flag = bookService.deleteBook(id);
	            if(flag == "Y") {
	            	magerror ="Delete Success";
	            }else {
	            	magerror ="Delete Fail";
	            }
	            return ResponseEntity.ok(magerror);
	     
	    }
	
}
