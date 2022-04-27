package com.jenspetur94.MovieData.data.db.jpa.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Date birthday;

    @OneToMany(mappedBy = "user")
    private List<TagData> tagData;

    @OneToMany(mappedBy = "userData")
    private List<RatingData> ratingData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<TagData> getTags() {
        return tagData;
    }

    public void setTags(List<TagData> tagData) {
        this.tagData = tagData;
    }

    public List<RatingData> getRatings() {
        return ratingData;
    }

    public void setRatings(List<RatingData> ratingData) {
        this.ratingData = ratingData;
    }
}
