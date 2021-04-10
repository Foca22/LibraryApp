package com.oop_library;

import java.util.List;
import java.util.Scanner;

public class NovelSearchUtil extends Novel {

    public NovelSearchUtil(String name, String author, String volume, int numberOfPages, String type, String publicationYear) {
        super(name, author, volume, numberOfPages, type, publicationYear);
    }



    static void searchOptions(List<Novel> novelList, String novelScanner) {
        boolean novelSearchContinue = true;

        while (novelSearchContinue) {
            System.out.println("Please enter search criteria: (e.g: 'author', 'novel type', 'publication year')");
            Scanner sc = new Scanner(System.in);
            novelScanner = sc.nextLine();

            switch (novelScanner) {
                case "name":
                    searchNovelsByName(novelList, novelScanner);
                    break;
                case "author":
                    searchNovelsByAuthor(novelList, novelScanner);
                    break;
                case "novel type":
                    searchNovelsByType(novelList, novelScanner);
                    break;
                case "publication year":
                    searchNovelsByPubYear(novelList, novelScanner);
                    break;
                default:
                    System.err.println("ERROR!");
            }

            System.out.println("Do you want to continue to search for another novel? (Y/N)");
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


    private static void searchNovelsByName(List<Novel> novelList, String novelNameScanner) {
        System.out.println("Please enter a name to search by: ");
        Scanner sc = new Scanner(System.in);
        novelNameScanner = sc.nextLine();
        boolean bookFind = false;


        for (Novel novel : novelList) {
            if (novelNameScanner.equals(novel.name)) {
                System.out.println("Novel with name " + novelNameScanner + " exists from author " + novel.author + " vol. " + novel.volume);
                bookFind = true;
            }
        }
        if (!bookFind) {
            System.err.println("No novel name found! Please enter a valid name");
        }
    }


    private static void searchNovelsByAuthor(List<Novel> novelList, String novelAuthorScanner) {
        System.out.println("Please enter an author to search by: ");
        Scanner sc = new Scanner(System.in);
        novelAuthorScanner = sc.nextLine();
        boolean bookFind = false;


        for (Novel novel : novelList) {
            if (novelAuthorScanner.equals(novel.author)) {
                System.out.println("Author " + novelAuthorScanner + " exists with the following publication(s) " + novel.name + " vol. " + novel.volume);
                bookFind = true;
            }
        }
        if (!bookFind) {
            System.err.println("No author found! Please enter a valid author");
        }
    }

    private static void searchNovelsByType(List<Novel> novelList, String novelTypeScanner) {
        System.out.println("Please enter an type to search by: ");

        Scanner sc = new Scanner(System.in);
        novelTypeScanner = sc.nextLine();
        boolean bookFind = false;

        for (Novel novel : novelList) {
            if (novelTypeScanner.equals(novel.type)) {
                System.out.println("Novel of type " + novelTypeScanner + " exists with the following publication(s) " + novel.name + " from " + novel.author + " vol. " + novel.volume);
                bookFind = true;
            }
        }
        if (!bookFind) {
            System.err.println("Novel type not found! Please enter a valid novel type");
        }
    }

    private static void searchNovelsByPubYear(List<Novel> novels, String novelPublYearScanner) {
        System.out.println("Please enter a year to search by: ");

        Scanner sc = new Scanner(System.in);
        novelPublYearScanner = sc.nextLine();
        boolean bookFind = false;

        for (Novel novel : novels) {
            if (novelPublYearScanner.equals(novel.publicationYear)) {
                System.out.println("Novel from year " + novelPublYearScanner + " exists with the following publication(s) " + novel.name + " from " + novel.author + " vol. " + novel.volume);
                bookFind = true;
            }
        }
        if (!bookFind) {
            System.err.println("Novel publication year not found! Please enter a valid publication year");
        }
    }
}
