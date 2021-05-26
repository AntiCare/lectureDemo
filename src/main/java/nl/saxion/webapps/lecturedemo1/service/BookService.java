package nl.saxion.webapps.lecturedemo1.service;

import nl.saxion.webapps.lecturedemo1.moduls.Book;
import nl.saxion.webapps.lecturedemo1.moduls.BookShop;
import nl.saxion.webapps.lecturedemo1.repository.BookRepository;
import nl.saxion.webapps.lecturedemo1.repository.BookShopRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
    @Resource
    private BookRepository bookRepository;

    public void add(Book book) {
        bookRepository.save(book);
    }

    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
