package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity{
    @Column (name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @OneToMany(mappedBy = "category")
    private Set<NewEntity> news = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<NewEntity> getNews() {
        return news;
    }

    public void setNews(Set<NewEntity> news) {
        this.news = news;
    }
}
