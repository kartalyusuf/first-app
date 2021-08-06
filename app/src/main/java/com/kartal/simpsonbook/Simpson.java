package com.kartal.simpsonbook;

import java.io.Serializable;

public class Simpson implements Serializable {

    //private yapmamızın sebebi bir kere oluşturduktan sonra bir daha değiştirilmesin istiyoruz.
    private String name ;
    private String job ;
    private int pictureInteger; //int yapmamızın sebebi drawebleda görseller int şeklinde saklanır.

    public Simpson(String name, String job, int pictureInteger) {
        this.name = name;
        this.job = job;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
