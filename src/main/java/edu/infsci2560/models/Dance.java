/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class Dance {
    private static final long serialVersionUID = 1L;

    public enum DanceType {
        Jazz,
        Ballet,
        Street, 
        Folk,
        Ballroom,
        Unknown
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected DanceType danceType;
    protected String difficulty;
    //protected String  description;
    protected String timeNeed;

    public Dance() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.danceType = DanceType.Unknown;
        this.difficulty = null;
        //this.description = null;
        this.timeNeed = null;
    }

    public Dance(Long id, String name, DanceType danceType, String difficulty, String timeNeed) {
        this.id = id;
        this.name = name;
        this.danceType = danceType;
        this.difficulty = difficulty;
        //this.description = description;
        this.timeNeed = timeNeed;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", danceType=" + this.danceType + ", difficulty=" +this.difficulty+", timeNeed=" +this.timeNeed+" ]";
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the danceType
     */
    public DanceType getDanceType() {
        return danceType;
    }

    /**
     * @param danceType the danceType to set
     */
    public void setDanceType(DanceType danceType) {
        this.danceType = danceType;
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


    /**
     * @return the difficulty
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the description
     */

    //public String getDescription() {
        //return description;
    //}

    /**
     * @param description the description to set
     */
    //public void setDescription(String description) {
        //this.description = description;
    //}

    /**
     * @return the timeNeed
     */
    public String getTimeNeed() {
        return timeNeed;
    }

    /**
     * @param timeNeed the timeNeed to set
     */
    public void setTimeNeed(String timeNeed) {
        this.timeNeed = timeNeed;
    }

}