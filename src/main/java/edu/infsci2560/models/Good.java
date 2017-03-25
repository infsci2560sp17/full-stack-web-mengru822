package edu.infsci2560.models;

import java.net.*;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**     
 *
 * @author Mengru
 */
@Entity
public class Good {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected String brand;
    protected String link;

    public Good() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.brand = null;
        this.link = null;
    }

    public Good(Long id, String title, String brand, String link) {
        this.id = id;
        this.title = title;
        this.brand = brand;
        this.link = link;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", brand=" + this.brand + ", link=" + this.link + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param set the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param set the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the url
     */
    public String getLink() {
        return link;
    }

    /**
     * @param set the url
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}