/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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

package org.openapitools.client.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Tag;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

/**
  * A pet for sale in the pet store
 **/
public class Pet  {
  
  private Long id;

  private Category category;

  private String name;

  private List<String> photoUrls = new ArrayList<String>();

  private List<Tag> tags = null;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("available") AVAILABLE(String.valueOf("available")), @XmlEnumValue("pending") PENDING(String.valueOf("pending")), @XmlEnumValue("sold") SOLD(String.valueOf("sold"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

 /**
   * pet status in the store
  **/
  private StatusEnum status;
  
 /**
   * Get id
   * @return id
  **/
  @JsonbProperty("id")
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(Long id) {
    this.id = id;
  }

  public Pet id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonbProperty("category")
  public Category getCategory() {
    return category;
  }

  /**
    * Set category
  **/
  public void setCategory(Category category) {
    this.category = category;
  }

  public Pet category(Category category) {
    this.category = category;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonbProperty("name")
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public Pet name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get photoUrls
   * @return photoUrls
  **/
  @JsonbProperty("photoUrls")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  /**
    * Set photoUrls
  **/
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public Pet photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonbProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }

  /**
    * Set tags
  **/
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Pet tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(Tag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
   * pet status in the store
   * @return status
  **/
  @JsonbProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  /**
    * Set status
  **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Pet status(StatusEnum status) {
    this.status = status;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
