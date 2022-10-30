package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.LevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "routes")
public class RouteEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "LONGTEXT", name = "gpx_coordinates")
    private String gpxCoordinate;

    @Enumerated(value = EnumType.STRING)
    private LevelEnum level;


    @ManyToOne
    private UserEntity author;

    @Column
    private String videoUrl;

    @ManyToMany
    private Set<CategoryEntity> categories;

    public RouteEntity() {
    }

    public String getDescription() {
        return description;
    }

    public RouteEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getGpxCoordinate() {
        return gpxCoordinate;
    }

    public RouteEntity setGpxCoordinate(String gpxCoordinate) {
        this.gpxCoordinate = gpxCoordinate;
        return this;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public RouteEntity setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public RouteEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RouteEntity setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
}
