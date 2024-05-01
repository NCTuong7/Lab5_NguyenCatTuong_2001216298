package com.example.lab5_nguyencattuong_2001216298;

import java.util.ArrayList;

public class LanguageBai6 {
    int Idimg;
    String nameImg;

    public int getIdimg() {
        return Idimg;
    }

    public String getNameImg() {
        return nameImg;
    }

    public void setIdimg(int idimg) {
        Idimg = idimg;
    }

    public void setNameImg(String nameImg) {
        this.nameImg = nameImg;
    }

    public LanguageBai6(int idimg, String nameImg) {
        Idimg = idimg;
        this.nameImg = nameImg;
    }

    public static ArrayList<LanguageBai6> getData ()
    {
        ArrayList<LanguageBai6> bai6ArrayList = new ArrayList<>();
        LanguageBai6 selectLanguage = new LanguageBai6( 0,"Select a Language");
        LanguageBai6 html = new LanguageBai6(R.drawable.html,"HTML Language");
        LanguageBai6 cshape = new LanguageBai6(R.drawable.cshape,"C# Language");
        LanguageBai6 xml = new LanguageBai6(R.drawable.xml,"XML Language");
        LanguageBai6 php = new LanguageBai6(R.drawable.php,"PHP Language");
        bai6ArrayList.add(selectLanguage);
        bai6ArrayList.add(html);
        bai6ArrayList.add(cshape);
        bai6ArrayList.add(xml);
        bai6ArrayList.add(php);
        return bai6ArrayList;
    }
}
