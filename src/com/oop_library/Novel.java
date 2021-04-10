package com.oop_library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Novel extends Book{
    String type;
    String publicationYear;
    String volume;

    public Novel(String name, String author, String volume, int numberOfPages, String type, String publicationYear) {
        super.name = name;
        super.author = author;
        this.volume = volume;
        super.numberOfPages = numberOfPages;
        this.type = type;
        this.publicationYear = publicationYear;
    }

    public static List<Novel> loadNovels() {
        Novel novel1 = new Novel("Ion", "Liviu Rebreanu", "1", 512, "drama", "1920");
        Novel novel2 = new Novel("Morometii", "Marin Preda", "1", 464, "thriller", "1955");
        Novel novel3 = new Novel("Morometii", "Marin Preda", "2", 560, "thriller", "1967");

        return new ArrayList<>(Arrays.asList(novel1, novel2, novel3));
    }

    public static void printCollections(List<Novel> novels) {
        System.out.println("Novels names that are currently in the catalog: ");
        novelsName(novels);
    }

    public static void novelsName(List<Novel> novels) {
        for (Novel novel : novels) {
            System.out.print(novel.name + " ");
        }
        System.out.println();
    }
}
