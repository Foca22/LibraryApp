package com.oop_library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtAlbum extends Book{
    String paperQuality;

    public ArtAlbum(String name, String author, int numberOfPages, String paperQuality) {
        super.author = author;
        super.name = name;
        super.numberOfPages = numberOfPages;
        this.paperQuality = paperQuality;
    }

    public static List<ArtAlbum> loadArtAlbums() {
        ArtAlbum artAlbum1 = new ArtAlbum("Nature", "Gigi Natura", 458, "premium");
        ArtAlbum artAlbum2 = new ArtAlbum("Wildlife", "Steve Erwin", 759, "good");
        ArtAlbum artAlbum3 = new ArtAlbum("Oceanlife", "Michael Jackson", 100, "low");

        return new ArrayList<>(Arrays.asList(artAlbum1, artAlbum2, artAlbum3));
    }

    public static void printCollections(List<ArtAlbum> artAlbums) {
        System.out.println("Art Albums names that are currently in the catalog:: ");
        artAlbumsNames(artAlbums);
    }

    public static void artAlbumsNames(List<ArtAlbum> artAlbums) {
        for (ArtAlbum artAlbum : artAlbums){
            System.out.print(artAlbum.name + " ");
        }
        System.out.println();
    }
}
