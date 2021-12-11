package com.soap.soapservices.services;

import https.omeryazir_com.soap_example.Book;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    private static final Map<String, Book> book = new HashMap<>();

    @PostConstruct
    public void initializeBook(){
        Book litlePrince = new Book();
        litlePrince.setBookName("little prince");
        litlePrince.setCategory("novel");
        litlePrince.setCost(12.25);
        litlePrince.setPageNumber(124);

        //indicated address when parameters matched
        book.put(litlePrince.getBookName(), litlePrince);
    }

    public Book getBook(String bookName) {
        return book.get(bookName);
    }
}
