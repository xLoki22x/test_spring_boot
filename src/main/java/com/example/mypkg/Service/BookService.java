package com.example.mypkg.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mypkg.Repository.BookRepository;
import com.example.mypkg.model.Book;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findByid(id);
    }

    public Book addBook(Book book) {
    	Book savebook = new Book();
    	if(book != null) {
    		savebook =	bookRepository.save(book);
    	}
        return savebook;
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.settitle(bookDetails.gettitle());
        book.setauthor(bookDetails.getauthor());
        book.setisbn(bookDetails.getisbn());
        book.setpublishedDate(bookDetails.getpublishedDate());
        return bookRepository.save(book);
    }

    public String deleteBook(Long id) {
    	String flag ="N";
    	Book book = getBookById(id);
    	if(book != null) {    		
    		bookRepository.deleteById(id);
    		flag = "Y";
    	}
    	return flag;
    }

}
