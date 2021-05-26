package nl.saxion.webapps.lecturedemo1.controller;


import nl.saxion.webapps.lecturedemo1.moduls.Book;
import nl.saxion.webapps.lecturedemo1.moduls.BookShop;
import nl.saxion.webapps.lecturedemo1.service.BookService;
import nl.saxion.webapps.lecturedemo1.service.BookShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;


@Controller
public class BookController {

    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Book> showBooks = new ArrayList<>();
    public static String shopName;
    public static int bookValue;
    @Resource
    private BookService bookService;

    @GetMapping(path = "{id}/books")
    public Object Book(@PathVariable("id") String id) {
     BookShopController.shop_id = Integer.parseInt(id);
        System.out.println(BookShopController.shop_id);
        return "Book";
    }

    @RequestMapping(path = "/books/getShopName")
    @ResponseBody
    public Object getShopName(){
        shopName =BookShopController.bookShops.get(BookShopController.shop_id-BookShopController.value).getShopName();
        return BookShopController.bookShops.get(BookShopController.shop_id-BookShopController.value).getShopName();
    }

    @GetMapping(path = "/addBook")
    public Object AddBookShop(){
        return "AddBook";
    }


    @RequestMapping(path = "/api/addBook")
    @ResponseBody
    public Object AddBook(Book book){
        try{
            System.out.println("shop name: "+shopName);
            book.setShop_name(shopName);
            bookService.add(book);
            System.out.println(book.toString());
            books.add(book);
            bookValue=books.get(0).getId();
            //Status code
            return BookShopController.shop_id;
        }catch (Exception e){
            return "500";
        }
    }

    @RequestMapping("/books/get")
    @ResponseBody
    public Object bookShop() {
//        System.out.println(bookShops);
        for (Book e:books) {
            if(!showBooks.contains(e)){
                System.out.println("shopName: "+shopName);
                System.out.println("e.shopName: "+e.getShop_name());
                if(e.getShop_name().equals(shopName)){
                    showBooks.add(e);
                }
            }
        }
        System.out.println("XXXXXXXXXXXXXXXXXXX"+showBooks.toString());
        return showBooks;
    }


    @RequestMapping(path = "/api/deleteBook/{id}")
    @ResponseBody
    public Object deleteBookShop(@PathVariable("id") String id){

        try {
            int e = Integer.parseInt(id);
            System.out.println(e);
            //When the APP is stopped, the id in the database will not be cleared,
            // but the ArrayList in the APP will be cleared, so it is necessary to subtract a certain value.
            books.get(e-bookValue).setBookName(null);
            bookService.delete(e);
            //Status code
            return "200";
        }catch (Exception e){
            return "406";
        }
    }



}
