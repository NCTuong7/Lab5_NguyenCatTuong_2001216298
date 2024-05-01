package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;
import java.util.List;

public class Language {
    private long id;
    private String name;
    private float percent;

    public Language(long id, String name, float percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPercent() {
        return percent;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }
    public static List<Language> getLanguage ()
    {
        Language javascript  = new Language(1,"Javascript",67.7f);
        Language htmlCss  = new Language(2,"HTML/CSS",63.1f);
        Language sql  = new Language(3,"SQL",54.7f);
        Language python  = new Language(4,"Python",44.1f);
        Language java  = new Language(5,"Java",40.2f);

       List<Language> languages =  new ArrayList<Language>();
        languages.add(javascript);
        languages.add(htmlCss);
        languages.add(sql);
        languages.add(python);
        languages.add(java);
        return languages;
    }

}
