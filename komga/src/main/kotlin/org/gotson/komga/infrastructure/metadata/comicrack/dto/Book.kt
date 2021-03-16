package org.gotson.komga.infrastructure.metadata.comicrack.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Book {
  @JsonProperty(value = "Series")
  var series: String? = null

  @JsonProperty(value = "Number")
  var number: Int? = null

  @JsonProperty(value = "Volume")
  var volume: Int? = null

  @JsonProperty(value = "Year")
  var year: Int? = null

  @JsonProperty(value = "FileName")
  var fileName: String? = null

  override fun toString(): String {
    return "Book(series=$series, number=$number, volume=$volume, year=$year, fileName=$fileName)"
  }
}
