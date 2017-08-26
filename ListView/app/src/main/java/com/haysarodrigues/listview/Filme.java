package com.haysarodrigues.listview;

/**
 * Created by Haysa on 22/07/17.
 */

public class Filme {

    private String title;
    private String year;
    private String url;

    public Filme(String title, String year, String url) {
        this.title = title;
        this.year = year;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //user api picasso de imagens para android
}
