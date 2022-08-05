package com.controller;

import com.domain.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new Result(flag?Code.SAVE.getSuccess():Code.SAVE.getFail(), flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag?Code.DELETE.getSuccess() : Code.UPDATE.getFail(), flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag?Code.UPDATE.getSuccess() : Code.UPDATE.getFail(), flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = (book != null ? Code.GET.getSuccess() : Code.GET.getFail());
        String msg = (book != null ? "" : "数据查询失败");
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = (books != null ? Code.GET.getSuccess() : Code.GET.getFail());
        String msg = (books != null ? "" : "数据查询失败");
        return new Result(code,books,msg);
    }

    /*@GetMapping
    public List<Book> getAll(){
        List<Book> list = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setName("计算机");
        book1.setType("计算");
        book1.setDescription("springmvc");

        Book book2 = new Book();
        book2.setName("java编程");
        book2.setType("java");
        book2.setDescription("编程入门");

        list.add(book1);
        list.add(book2);

        return list;
    }*/


}
