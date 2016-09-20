/**
 * GraphHopper Geocoding API
 * GraphHopper Geocoding API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Point;


/**
 * Location
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-20T15:25:48.860+02:00")
public class Location   {
  @SerializedName("point")
  private Point point = null;

  @SerializedName("osm_id")
  private String osmId = null;

  @SerializedName("osm_type")
  private String osmType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("housenumber")
  private String housenumber = null;

  public Location point(Point point) {
    this.point = point;
    return this;
  }

   /**
   * Get point
   * @return point
  **/
  @ApiModelProperty(example = "null", value = "")
  public Point getPoint() {
    return point;
  }

  public void setPoint(Point point) {
    this.point = point;
  }

  public Location osmId(String osmId) {
    this.osmId = osmId;
    return this;
  }

   /**
   * OSM Id
   * @return osmId
  **/
  @ApiModelProperty(example = "null", value = "OSM Id")
  public String getOsmId() {
    return osmId;
  }

  public void setOsmId(String osmId) {
    this.osmId = osmId;
  }

  public Location osmType(String osmType) {
    this.osmType = osmType;
    return this;
  }

   /**
   * N = node, R = relation, W = way
   * @return osmType
  **/
  @ApiModelProperty(example = "null", value = "N = node, R = relation, W = way")
  public String getOsmType() {
    return osmType;
  }

  public void setOsmType(String osmType) {
    this.osmType = osmType;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Location street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Location housenumber(String housenumber) {
    this.housenumber = housenumber;
    return this;
  }

   /**
   * Get housenumber
   * @return housenumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHousenumber() {
    return housenumber;
  }

  public void setHousenumber(String housenumber) {
    this.housenumber = housenumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.point, location.point) &&
        Objects.equals(this.osmId, location.osmId) &&
        Objects.equals(this.osmType, location.osmType) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.street, location.street) &&
        Objects.equals(this.housenumber, location.housenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, osmId, osmType, name, country, city, state, street, housenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    osmId: ").append(toIndentedString(osmId)).append("\n");
    sb.append("    osmType: ").append(toIndentedString(osmType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    housenumber: ").append(toIndentedString(housenumber)).append("\n");
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
