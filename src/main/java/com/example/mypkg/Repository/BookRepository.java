package com.example.mypkg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mypkg.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query(value = "SELECT * FROM BOOK where id=:id",nativeQuery = true)
	Book findByid(@Param("id") Long id);
}
