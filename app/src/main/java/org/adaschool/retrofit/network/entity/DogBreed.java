package org.adaschool.retrofit.network.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DogBreed {
    @PrimaryKey int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "image_url")
    public String imageUrl;
}
