package com.senla.task8;

public class ChapterOfTheBook<T> {

    Integer pages;

    public ChapterOfTheBook(Integer pages) {

        this.pages = pages;
    }

    public Integer getPages() {
        return pages;
    }

    private void setPages(Integer pages) {
        this.pages = pages;
    }
}
