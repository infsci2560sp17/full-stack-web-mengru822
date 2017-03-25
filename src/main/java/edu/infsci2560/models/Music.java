package edu.infsci2560.models;

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
public class Music {

    //private static final long serialVersionUID = 1L;

    public enum category {
        Pleasant,
        Lyrical,
        Soft,
        Archaic,
        Others
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected category category;
    @Column(length = 4096)
    protected String music;

    public Music() {
        this.id = Long.MAX_VALUE;
        this.category = category.Others;
        this.music = music;
    }

    public Music(Long id, category category, String music) {
        this.id = id;
        this.category = category;
        this.music = music;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", category=" + this.category + ", music=" + this.music + " ]";
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
     * @return the category
     */
    public category getCategory() {
        return category;
    }

    /**
     * @param set the category
     */
    public void setCategory(category category) {
        this.category = category;
    }

    /**
     * @return the music
     */
    public String getMusic() {
        return music;
    }

    /**
     * @param set the music
     */
    public void setMusic(String music) {
        this.music = music;
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