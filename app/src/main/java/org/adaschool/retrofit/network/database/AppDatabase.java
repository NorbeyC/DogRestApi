package org.adaschool.retrofit.network.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import org.adaschool.retrofit.network.entity.DogBreed;
import org.adaschool.retrofit.network.entity.DogBreedDao;

@Database(entities = {DogBreed.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DogBreedDao DogBreedDao();
}
