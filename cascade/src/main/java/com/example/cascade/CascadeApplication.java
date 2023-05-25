package com.example.cascade;

import com.example.cascade.Entities.Author;
import com.example.cascade.Entities.Book;
import com.example.cascade.Repository.AuthorRepository;
import com.example.cascade.Repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class CascadeApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CascadeApplication.class, args);
        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
		BookRepository bookRepository = context.getBean(BookRepository.class);

        //cascadeType.All
//        Author author = new Author();
//        author.setName("John Smith");
//
//        Book book1 = new Book();
//        book1.setTitle("Book 1");
//        book1.setAuthor(author);
//
//        Book book2 = new Book();
//        book2.setTitle("Book 2");
//        book2.setAuthor(author);
////
//        author.setBooks(Arrays.asList(book1, book2));
//
//		authorRepository.save(author);
        //check delete. delete author will automatically delete those books also.
//		authorRepository.delete(authorRepository.getById(2L));
		//deleting one book would not delete the author, because the association table is book, author is the owing side
//		bookRepository.delete(bookRepository.getById(3L));



    }

}
