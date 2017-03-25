package edu.infsci2560.models;

import java.net.*; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author Mengru
 */
@Entity
public class Video {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(length = 4096)
    protected String description;
    protected String link;

    public Video() {
        this.id = Long.MAX_VALUE;
        this.description = description;
        this.link = link;
    }

    public Video(Long id, String description, String link) {
        this.id = id;
        this.description = description;
        this.link = link;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", description=" + this.description + ", link=" + this.link + " ]";
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param set the description
     */
    public void setCategory(String description) {
        this.description = description;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param set the link
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