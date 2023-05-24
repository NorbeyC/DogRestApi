package org.adaschool.retrofit.network.dto;

import com.google.gson.annotations.SerializedName;

public class BreedRandomImage {
    private String status;
    @SerializedName("message")
    private String dogImage;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDogImage() {
        return dogImage;
    }

    public void setDogImage(String dogImage) {
        this.dogImage = dogImage;
    }
}
