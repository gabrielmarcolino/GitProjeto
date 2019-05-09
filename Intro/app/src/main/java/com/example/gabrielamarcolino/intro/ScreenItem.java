package com.example.gabrielamarcolino.intro;

public class ScreenItem {

    String Title, Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    //TRABALHAMDO COM SET
    public void setTitle(String title) { Title = title; }
    public void setDescription(String description) { Description = description; }
    public void setScreenImg(int screenImg) { ScreenImg = screenImg; }

    //TRABALHANDO COM GET
    public String getTitle() { return Title; }
    public String getDescription() { return Description; }
    public int getScreenImg() { return ScreenImg; }
    }
