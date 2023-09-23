package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * ClassName: App2
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/19 21:09
 */
public class App2 {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        System.out.println("|-----------------------------|");

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
