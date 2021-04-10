package com.oop_library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NovelRemoveUtil extends Novel {

    public NovelRemoveUtil(String name, String author, String volume, int numberOfPages, String type, String publicationYear) {
        super(name, author, volume, numberOfPages, type, publicationYear);
    }



    public static List removeNovelFromLibrary(List<Novel> novelList) {
        System.out.println("Would you like to remove a novel from the Library? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String removeScanner = sc.nextLine();

        boolean novelRemoveContinue = true;

        while (novelRemoveContinue){
            switch (removeScanner) {
                case "Y":
                    System.out.println("Please enter a novel name to delete: ");
                    Scanner removeNovel = new Scanner(System.in);
                    String novelToRemove = removeNovel.nextLine();
                    for (Novel novel : novelList) {
                        if (novelToRemove.equals(novel.name))
                            novelList.remove(novel);
                    }
                    Novel.printCollections(novelList);
                    break;
                case "N":
                    System.out.println("You typed 'N'! Exiting programme!");
                    break;
                default:
                    System.err.println("User command input not valid! Please enter a valid command like 'Y' or 'N'!");
            }

            System.out.println("Do you want to continue to remove another novel? (Y/N)");
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
