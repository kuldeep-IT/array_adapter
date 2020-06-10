package com.example.arrayadapter;

public class Word {

    private String gujarati;
    private String english;
    private int photo;

    public Word(String g, String e,int p)
    {
        gujarati=g;
        english=e;
        photo = p;
    }

    public String getGujarati()
    {
        return gujarati;
    }

    public String getEnglish()
    {
        return english;
    }

    public int getPhoto() {
        return photo;
    }
}
