package com.oop_library;

import java.util.List;
import java.util.Scanner;

public class ArtAlbumSearchUtil extends ArtAlbum {

    public ArtAlbumSearchUtil(String name, String author, int numberOfPages, String paperQuality) {
        super(name, author, numberOfPages, paperQuality);
    }

    static void searchOptions(List<ArtAlbum> artAlbumList, String artAlbumScanner) {
        boolean novelSearchContinue = true;

        while (novelSearchContinue) {
            System.out.println("Please enter search criteria: (e.g: 'name', 'author', 'paper quality')");
            Scanner sc = new Scanner(System.in);
            artAlbumScanner = sc.nextLine();

            switch (artAlbumScanner) {
                case "name":
                    searchArtAlbumByName(artAlbumList, artAlbumScanner);
                    break;
                case "author":
                    searchArtAlbumByAuthor(artAlbumList, artAlbumScanner);
                    break;
                case "paper quality":
                    searchArtAlbumByPaperQuality(artAlbumList, artAlbumScanner);
                    break;
                default:
                    System.err.println("ERROR!");
            }
            System.out.println("Do you want to continue to search for another Art Album? (Y/N)");
            Scanner searchScannerContinue = new Scanner(System.in);
            String yesOrNoCommand = searchScannerContinue.nextLine();

            switch (yesOrNoCommand){
                case "Y":
                    continue;
                case "N":
                    novelSearchContinue = false;
                    System.out.println("You typed 'N'! Exiting programme!");
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }
        }
    }

    private static void searchArtAlbumByName(List<ArtAlbum> artAlbums, String artAlbumNameScanner) {
        System.out.println("Please enter a name to search by: ");
        Scanner sc = new Scanner(System.in);
        artAlbumNameScanner = sc.nextLine();
        boolean artAlbumFind = false;

        for (ArtAlbum artAlbum : artAlbums) {
            if (artAlbumNameScanner.equals(artAlbum.name)) {
                System.out.println("Art Album with name " + artAlbumNameScanner + " exists from author " + artAlbum.author + " with " + artAlbum.numberOfPages + " pages");
                artAlbumFind = true;
            }
        }
        if (!artAlbumFind) {
            System.err.println("No Art Album name found! Please enter a valid name");
        }
    }

    private static void searchArtAlbumByAuthor(List<ArtAlbum> artAlbums, String authorScanner) {
        System.out.println("Please enter an author to search by: ");
        Scanner sc = new Scanner(System.in);
        authorScanner = sc.nextLine();
        boolean artAlbumFind = false;


        for (ArtAlbum artAlbum : artAlbums) {
            if (authorScanner.equals(artAlbum.author)) {
                System.out.println("Author " + authorScanner + " exists with the following publication(s) " + artAlbum.name + " with " + artAlbum.numberOfPages + " pages");
                artAlbumFind = true;
            }
        }
        if (!artAlbumFind) {
            System.err.println("No author found! Please enter a valid author");
        }
    }

    private static void searchArtAlbumByPaperQuality(List<ArtAlbum> artAlbums, String artAlbumPaperQualityScanner) {
        System.out.println("Please enter an novel type to search by: ");

        Scanner sc = new Scanner(System.in);
        artAlbumPaperQualityScanner = sc.nextLine();
        boolean artAlbumFind = false;

        for (ArtAlbum artAlbum : artAlbums) {
            if (artAlbumPaperQualityScanner.equals(artAlbum.paperQuality)) {
                System.out.println("Art Album with " + artAlbumPaperQualityScanner + " paper quality exists from author " + artAlbum.author + " with " + artAlbum.numberOfPages + " pages");
                artAlbumFind = true;
            }
        }
        if (!artAlbumFind) {
            System.err.println("Art Album with paper quality not found! Please enter a valid publication year");
        }
    }
}
