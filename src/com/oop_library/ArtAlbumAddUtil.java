package com.oop_library;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArtAlbumAddUtil extends ArtAlbum{

    public ArtAlbumAddUtil(String name, String author, int numberOfPages, String paperQuality) {
        super(name, author, numberOfPages, paperQuality);
    }



    public static List addArtAlbumToLibrary(List<ArtAlbum> artAlbumList) {
        System.out.println("Would you like to add another ArtAlbum to the Library? (Y/N)");

        Scanner sc = new Scanner(System.in);
        String addScanner = sc.nextLine();
        boolean artAlbumSearchContinue = true;

        while (artAlbumSearchContinue) {
            switch (addScanner) {
                case "Y":
                    System.out.println("Please add the Art Album's name: ");
                    Scanner artAlbumNameAddScanner = new Scanner(System.in);
                    String artAlbumNameToAdd = artAlbumNameAddScanner.nextLine();

                    System.out.println("Please add the Art Album's author: ");
                    Scanner artAlbumAuthorAddScanner = new Scanner(System.in);
                    String artAlbumAuthorToAdd = artAlbumAuthorAddScanner.nextLine();

                    System.out.println("Please add the Art Album's number of pages: ");
                    Scanner artAlbumNumPgScanner = new Scanner(System.in);
                    int artAlbumNumPgToAdd = artAlbumNumPgScanner.nextInt();

                    System.out.println("Please add the Art Album's paper quality: ");
                    Scanner artAlbumPaperQlyScanner = new Scanner(System.in);
                    String artAlbumPaperQlyPageToAdd = artAlbumPaperQlyScanner.nextLine();


                    ArtAlbum newArtAlbumToAddToLibrary = new ArtAlbum(artAlbumNameToAdd, artAlbumAuthorToAdd, artAlbumNumPgToAdd, artAlbumPaperQlyPageToAdd);
                    artAlbumList.add(newArtAlbumToAddToLibrary);
                case "N":
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }
            System.out.println("Do you want to continue to add another Art Album? (Y/N)");
            Scanner searchScannerContinue = new Scanner(System.in);
            String yesOrNoCommand = searchScannerContinue.nextLine();

            switch (yesOrNoCommand) {
                case "Y":
                    continue;
                case "N":
                    artAlbumSearchContinue = false;
                    System.out.println("You typed 'N'! Exiting programme!");
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }
        }
        return null;
    }
}
