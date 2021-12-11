package com.soap.soapservices.endpoints;

import com.soap.soapservices.services.BookService;
import https.omeryazir_com.soap_example.GetBookRequest;
import https.omeryazir_com.soap_example.GetBookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "https://omeryazir.com/soap-example/";

    private BookService bookService;

    @Autowired
    public BookEndpoint(BookService bookService){
        this.bookService = bookService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBookEndpoint(@RequestPayload GetBookRequest getBookRequest){
        GetBookResponse getBookResponse = new GetBookResponse();
        getBookResponse.setBook(bookService.getBook(getBookRequest.getBookName()));
        return getBookResponse;

    }
}
