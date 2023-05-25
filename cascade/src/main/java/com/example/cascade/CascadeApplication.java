package com.example.cascade;

import com.example.cascade.Entities.Author;
import com.example.cascade.Entities.Book;
import com.example.cascade.Entities.PersistAuthor;
import com.example.cascade.Entities.PersistBook;
import com.example.cascade.Repository.AuthorRepository;
import com.example.cascade.Repository.BookRepository;
import com.example.cascade.Repository.PersistAuthorRepository;
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
        PersistAuthorRepository persistAuthorRepository = context.getBean(PersistAuthorRepository.class);
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
        //cascadeType.PERSIST
//        PersistAuthor persistAuthor = new PersistAuthor();
//        persistAuthor.setName("John Smith");
//                PersistBook persistBook1 = new PersistBook();
//        persistBook1.setTitle("Book 1");
//        persistBook1.setPersistAuthor(persistAuthor);
//
//        PersistBook persistBook2 = new PersistBook();
//        persistBook2.setTitle("Book 2");
//        persistBook2.setPersistAuthor(persistAuthor);
////
//        persistAuthor.setPersistBooks(Arrays.asList(persistBook1, persistBook2));

//        persistAuthorRepository.save(persistAuthor);
//        persistAuthorRepository.delete(persistAuthorRepository.getById(1L)); // show error because here automatically
//        books not deleted. to operate this operation first of all need to delete book first

    }

}
