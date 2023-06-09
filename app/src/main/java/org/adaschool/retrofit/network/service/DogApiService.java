package org.adaschool.retrofit.network.service;

import org.adaschool.retrofit.network.dto.BreedImagesDto;
import org.adaschool.retrofit.network.dto.BreedsListDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DogApiService {
    @GET("api/breeds/list/all")
    Call<BreedsListDto> getAllBreeds();

    @GET("api/breed/{breed}/images")
    Call<BreedImagesDto> getBreedImages(@Path("breed") String breed);

}