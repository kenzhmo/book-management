package com.book.management.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Base book object
 */
@Schema(description = "Base book object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-05T05:18:47.070Z[GMT]")


public class Book   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("publishYear")
  private Integer publishYear = null;

  @JsonProperty("isbn")
  private String isbn = null;

  @JsonProperty("price")
  private Double price = null;

  public Book id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  @Schema(description = "")
  
    public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book publishYear(Integer publishYear) {
    this.publishYear = publishYear;
    return this;
  }

  /**
   * Get publishYear
   * @return publishYear
   **/
  @Schema(description = "")
  
    public Integer getPublishYear() {
    return publishYear;
  }

  public void setPublishYear(Integer publishYear) {
    this.publishYear = publishYear;
  }

  public Book isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
   **/
  @Schema(description = "")
  
    public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Book price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.name, book.name) &&
        Objects.equals(this.author, book.author) &&
        Objects.equals(this.publishYear, book.publishYear) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.price, book.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, author, publishYear, isbn, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    publishYear: ").append(toIndentedString(publishYear)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
