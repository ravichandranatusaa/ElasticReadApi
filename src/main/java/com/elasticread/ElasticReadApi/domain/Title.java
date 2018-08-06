package com.elasticread.ElasticReadApi.domain;

public class Title {

    private String sgenno;
    private String titleName;
    private String aka;

    public String getSgenno() {
        return sgenno;
    }

    public void setSgenno(String sgenno) {
        this.sgenno = sgenno;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getAka() {
        return aka;
    }

    public void setAka(String aka) {
        this.aka = aka;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    private String series;


}
