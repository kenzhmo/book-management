package com.book.management.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * generic error response
 */
@Schema(description = "generic error response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-05T05:18:47.070Z[GMT]")


public class GenericErrorResponse   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMsg")
  private String errorMsg = null;

  public GenericErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   **/
  @Schema(description = "")
  
    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public GenericErrorResponse errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * Get errorMsg
   * @return errorMsg
   **/
  @Schema(description = "")
  
    public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericErrorResponse genericErrorResponse = (GenericErrorResponse) o;
    return Objects.equals(this.errorCode, genericErrorResponse.errorCode) &&
        Objects.equals(this.errorMsg, genericErrorResponse.errorMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericErrorResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
