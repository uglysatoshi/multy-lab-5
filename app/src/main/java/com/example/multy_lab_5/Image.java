package com.example.multy_lab_5;

public class Image {
    private final String name; // название
    private final int imageRes; // картинка
    public Image(String name, int image){
        this.name = name;
        this.imageRes = image;
    }
    public String getName() {
        return this.name;
    }
    public int getImageResource() {
        return this.imageRes;
    }
}