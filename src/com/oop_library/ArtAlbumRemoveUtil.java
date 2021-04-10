package com.oop_library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArtAlbumRemoveUtil extends ArtAlbum{

    public ArtAlbumRemoveUtil(String name, String author, int numberOfPages, String paperQuality) {
        super(name, author, numberOfPages, paperQuality);
    }



    public static List removeArtAlbumFromLibrary(List<ArtAlbum> artAlbumList) {
        System.out.println("Would you like to remove an Art Album from the Library? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String removeScanner = sc.nextLine();

        boolean novelRemoveContinue = true;

        while (novelRemoveContinue){
            switch (removeScanner) {
                case "Y":
                    System.out.println("Please enter an Art Album name to delete: ");
                    Scanner removeArtAlbum = new Scanner(System.in);
                    String artAlbumToRemove = removeArtAlbum.nextLine();
                    for (ArtAlbum artAlbum : artAlbumList) {
                        if (artAlbumToRemove.equals(artAlbum.name))
                            artAlbumList.remove(artAlbum);
                    }
                    ArtAlbum.printCollections(artAlbumList);
                    break;
                case "N":
                    System.out.println("You typed 'N'! Exiting programme!");
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }

            System.out.println("Do you want to continue to remove another Art Album? (Y/N)");
            Scanner searchScannerContinue = new Scanner(System.in);
            String yesOrNoCommand = searchScannerContinue.nextLine();

            switch (yesOrNoCommand) {
                case "Y":
                    continue;
                case "N":
                    novelRemoveContinue = false;
                    System.out.println("You typed 'N'! Exiting programme!");
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }
        }
        return null;
    }
}
