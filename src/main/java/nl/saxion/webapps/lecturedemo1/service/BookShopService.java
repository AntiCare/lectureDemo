package nl.saxion.webapps.lecturedemo1.service;

import nl.saxion.webapps.lecturedemo1.moduls.BookShop;
import nl.saxion.webapps.lecturedemo1.repository.BookShopRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookShopService {
    @Resource
    private BookShopRepository bookShopRepository;

    public void add(BookShop bookShop) {
        bookShopRepository.save(bookShop);
    }


}
