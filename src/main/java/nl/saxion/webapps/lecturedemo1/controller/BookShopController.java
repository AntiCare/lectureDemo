package nl.saxion.webapps.lecturedemo1.controller;

import nl.saxion.webapps.lecturedemo1.moduls.Book;
import nl.saxion.webapps.lecturedemo1.moduls.BookShop;
import nl.saxion.webapps.lecturedemo1.service.BookService;
import nl.saxion.webapps.lecturedemo1.service.BookShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class BookShopController {

     public static ArrayList<BookShop> bookShops = new ArrayList<>();
     public static ArrayList<BookShop> showUserShop = new ArrayList<>();
     public static ArrayList<Integer> deleteBooks=new ArrayList<>();
     public static int shop_id;
     public static int value;
     public static int update_id;
    @Resource
    private BookShopService bookShopService;
    @Resource
    private BookService bookService;

    @RequestMapping("/api/getBooksShops")
    @ResponseBody
    public Object bookShop() {
//        System.out.println(bookShops);
        for (BookShop e:bookShops) {
         if(!showUserShop.contains(e)){
             if(e.getUser_email().equals(UserController.userLogin.getEmail())){
                 showUserShop.add(e);
             }
         }
        }
        return showUserShop;
    }

    @RequestMapping(path = "/bookShops")
    public Object bookShops(){
        return "BookShop";
    }


    @RequestMapping(path = "/api/addBookshop")
    @ResponseBody
    public Object AddBookShopAdd(BookShop bookShop){

        try{
            System.out.println(UserController.userLogin);
            bookShop.setUser_email(UserController.userLogin.getEmail());
            bookShopService.add(bookShop);
            System.out.println(bookShop);
            bookShops.add(bookShop);
            value=bookShops.get(0).getId();
            //Status code
            return "200";
        }catch (Exception e){
            return "500";
        }
    }


    @RequestMapping(path = "/api/updateBookshop")
    @ResponseBody
    public Object updateBookShopUpdate(BookShop bookShop){

        try{
            bookShop.setUser_email(UserController.userLogin.getEmail());
            bookShopService.update(update_id,bookShop);
            bookShops.get(update_id-value).setShopName(bookShop.getShopName());
            bookShops.get(update_id-value).setEmployeeNum(bookShop.getEmployeeNum());
            bookShops.get(update_id-value).setAddress(bookShop.getAddress());
            bookShops.get(update_id-value).setPhoneNumber(bookShop.getPhoneNumber());
            return "200";
        }catch (Exception e){
            return "406";
        }
    }


    @RequestMapping(path = "/api/deleteBookshop/{id}")
    @ResponseBody
    public Object deleteBookShop(@PathVariable("id") String id){

        try {
            int e = Integer.parseInt(id);
            System.out.println(e);
            //When the APP is stopped, the id in the database will not be cleared,
            // but the ArrayList in the APP will be cleared, so it is necessary to subtract a certain value.
            bookShops.get(e-value).setShopName(null);
            //delete shop.
            bookShopService.delete(e);
            //delete book.
            for (Book each:BookController.books) {
                if(each.getBookName()!=null && each.getShop_id()==e){
                    deleteBooks.add(each.getId());
                }
            }
            System.out.println("deleteBooks: "+deleteBooks.toString());
            bookService.deleteBooks(deleteBooks);
            deleteBooks.clear();
            //Status code
            return "200";
        }catch (Exception e){
            return "406";
        }
    }

    @GetMapping(path = "/bookShops/update/{id}")
    public Object updateBookShop(@PathVariable("id")String id) {
        update_id=Integer.parseInt(id);
        return "UpdateBookShop";


    }



    @GetMapping(path = "/addBookShop")
    public Object AddBookShop(){
        return "AddBookShop";
    }












}
