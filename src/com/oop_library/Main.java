package com.oop_library;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        List<Novel> novelList = NovelAddUtil.loadNovels();
        List<ArtAlbum> artAlbumList = ArtAlbumAddUtil.loadArtAlbums();

        // initial printing of the Library catalogue
        Novel.printCollections(novelList);
        System.out.println(" ");
        ArtAlbum.printCollections(artAlbumList);
        System.out.println(" ");

        libraryOptions(novelList, artAlbumList);

        // re-printing of the Library catalogue
        NovelAddUtil.printCollections(novelList);
        System.out.println(" ");
        ArtAlbumAddUtil.printCollections(artAlbumList);
    }


    public static void libraryOptions(List<Novel> novelList, List<ArtAlbum> artAlbumList) {
        System.out.println("Following options are available in this menu: (e.g: novel search, art album search)");
        System.out.println("- 'novel search' - searches for a novel in the Library");
        System.out.println("- 'art album search' - searches for an Art Album in the Library");
        System.out.println("- 'add novel' - adds a novel in the Library");
        System.out.println("- 'remove novel' - adds a novel in the Library");
        System.out.println("- 'add art album' - adds an Art Album in the Library");
        System.out.println("- 'remove art album' - adds an Art Album in the Library");

        Scanner sc = new Scanner(System.in);
        String searchOpt = sc.nextLine();

        switch (searchOpt) {
            case "novel search":
                NovelSearchUtil.searchOptions(novelList, null);
                break;
            case "art album search":
                ArtAlbumSearchUtil.searchOptions(artAlbumList, null);
                break;
            case "add novel":
                NovelAddUtil.addNovelToLibrary(novelList);
                break;
            case "remove novel":
                NovelRemoveUtil.removeNovelFromLibrary(novelList);
                break;
            case "add art album":
                ArtAlbumAddUtil.addArtAlbumToLibrary(artAlbumList);
                break;
            case "remove art album":
                ArtAlbumRemoveUtil.removeArtAlbumFromLibrary(artAlbumList);
                break;
            default:
                System.err.println("ERROR! Search criteria not found!");
        }
    }

}

