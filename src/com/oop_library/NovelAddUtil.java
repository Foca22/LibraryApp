package com.oop_library;

import java.util.List;
import java.util.Scanner;

public class NovelAddUtil extends Novel {

    public NovelAddUtil(String name, String author, String volume, int numberOfPages, String type, String publicationYear) {
        super(name, author, volume, numberOfPages, type, publicationYear);
    }



    public static List addNovelToLibrary(List<Novel> novelList) {
        System.out.println("Would you like to add another novel to the Library? (Y/N)");

        Scanner sc = new Scanner(System.in);
        String addScanner = sc.nextLine();
        boolean novelSearchContinue = true;

        while (novelSearchContinue) {
            switch (addScanner) {
                case "Y":
                    System.out.println("Please add the novel's name: ");
                    Scanner novelNameAddScanner = new Scanner(System.in);
                    String novelNameToAdd = novelNameAddScanner.nextLine();

                    System.out.println("Please add the novel's author: ");
                    Scanner novelAuthorAddScanner = new Scanner(System.in);
                    String novelAuthorToAdd = novelAuthorAddScanner.nextLine();

                    System.out.println("Please add the novel's volume: ");
                    Scanner novelVolumeScanner = new Scanner(System.in);
                    String novelVolumeToAdd = novelVolumeScanner.nextLine();

                    System.out.println("Please add the novel's number of pages: ");
                    Scanner novelNumPageAddScanner = new Scanner(System.in);
                    int novelNumPageToAdd = novelNumPageAddScanner.nextInt();

                    System.out.println("Please add the novel's type: ");
                    Scanner novelTypeScanner = new Scanner(System.in);
                    String novelTypeToAdd = novelTypeScanner.nextLine();

                    System.out.println("Please add the novel's publication year: ");
                    Scanner novelPubYrScanner = new Scanner(System.in);
                    String novelPubYrToAdd = novelPubYrScanner.nextLine();

                    Novel newNovelToAddToLibrary = new Novel(novelNameToAdd, novelAuthorToAdd, novelVolumeToAdd, novelNumPageToAdd, novelTypeToAdd, novelPubYrToAdd);
                    novelList.add(newNovelToAddToLibrary);
                case "N":
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }
            System.out.println("Do you want to continue to add another novel? (Y/N)");
            Scanner searchScannerContinue = new Scanner(System.in);
            String yesOrNoCommand = searchScannerContinue.nextLine();

            switch (yesOrNoCommand) {
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
        return null;
    }
}
