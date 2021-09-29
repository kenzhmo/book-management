package com.book.management.server.api;

import com.book.management.server.model.AllBooks;
import com.book.management.server.model.Book;
import com.book.management.server.model.AckResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-05T05:18:47.070Z[GMT]")
@RestController
@Slf4j
public class BooksApiController implements BooksApi {

    private static final Logger log = LoggerFactory.getLogger(BooksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BooksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Book> addBook(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Book body) {
        log.info("step into addBook endpoint");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Book>(objectMapper.readValue("{\n  \"publishYear\" : 6,\n  \"author\" : \"author\",\n  \"price\" : 1.4658129805029452,\n  \"isbn\" : \"isbn\",\n  \"name\" : \"name\",\n  \"id\" : 0\n}", Book.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Book>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AckResponse> deleteBook(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("bookId") Integer bookId) {
        log.info("step into deleteBook endpoint");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AckResponse>(objectMapper.readValue("{ }", AckResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AckResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AckResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Book> getBook(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("bookId") Integer bookId) {
        log.info("step into getBook endpoint");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Book>(objectMapper.readValue("{\n  \"publishYear\" : 6,\n  \"author\" : \"author\",\n  \"price\" : 1.4658129805029452,\n  \"isbn\" : \"isbn\",\n  \"name\" : \"name\",\n  \"id\" : 0\n}", Book.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Book>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AllBooks> getBooks() {
        log.info("step into getBooks endpoint");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AllBooks>(objectMapper.readValue("[ {\n  \"publishYear\" : 6,\n  \"author\" : \"author\",\n  \"price\" : 1.4658129805029452,\n  \"isbn\" : \"isbn\",\n  \"name\" : \"name\",\n  \"id\" : 0\n}, {\n  \"publishYear\" : 6,\n  \"author\" : \"author\",\n  \"price\" : 1.4658129805029452,\n  \"isbn\" : \"isbn\",\n  \"name\" : \"name\",\n  \"id\" : 0\n} ]", AllBooks.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AllBooks>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AllBooks>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Book> modifyBook(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Book body) {
        log.info("step into modifyBook endpoint");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Book>(objectMapper.readValue("{\n  \"publishYear\" : 6,\n  \"author\" : \"author\",\n  \"price\" : 1.4658129805029452,\n  \"isbn\" : \"isbn\",\n  \"name\" : \"name\",\n  \"id\" : 0\n}", Book.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Book>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AckResponse> uploadBookImage(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("bookId") Integer bookId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Object body) {
        log.info("step into uploadBookImage endpoint");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AckResponse>(objectMapper.readValue("{ }", AckResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AckResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AckResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
