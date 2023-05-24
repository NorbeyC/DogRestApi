package org.adaschool.retrofit.network.dto;

public class DogBreed {

    final String name;

    final String imageUrl;

    public DogBreed(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
