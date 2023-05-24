package org.adaschool.retrofit.network.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DogBreedDao {
    @Query("SELECT * FROM dogbreed")
    List<DogBreed> getAll();

    @Query("SELECT * FROM dogbreed WHERE id IN (:userIds)")
    List<DogBreed> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM dogbreed WHERE name LIKE :name AND " +
            "image_url LIKE :image LIMIT 1")
    DogBreed findByName(String name, String image);

    @Insert
    void insertAll(DogBreed... DogBrerds);

    @Delete
    void delete(DogBreed DogBreed);
}
