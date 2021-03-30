/*
 *
 *   Author: Aditya Chotai
 *   E-mail: avc6129@psu.edu
 *   Course: CMPSC221
 *   Assignment: Programming Assignment 3
 *   Due date: 31/3/2021
 *   File: FavoritesBarWithDriver.java
 *   Purpose: My Java application that Favorites bar program to add recently visited site.
 *   Compiler/IDE: Java SE Development Kit (OpenJDK) 11.0.2/IntelliJ IDEA 2020.3.2
 *   Operating system: MS Windows 10 Home
 */

import java.io.*;
import java.util.*;

public class FavoritesBarWithDriver {
    ArrayList<Website> webSiteList = null;
    Website currentWebsite;
    Scanner scanner;
    String currentLine="";
    ArrayList<Website> favoriteBar = null;
    ArrayList<Website> chosenWebsite = null;
    int favoriteCount = 0;
    
    public void createWebsiteList()
    {
        webSiteList = new ArrayList<Website>();
        try
        {
            File file  = new File("AdityaProject03/websites.txt");
            scanner = new Scanner(new FileInputStream(file.getAbsolutePath()));
            while(scanner.hasNext())
            {
                String rating, topic, websiteName, websiteURL, dateLastVisited; 
                rating = scanner.nextLine();
                topic = scanner.nextLine();
                websiteName = scanner.nextLine();
                websiteURL = scanner.nextLine();
                dateLastVisited = scanner.nextLine();   
                currentWebsite = new Website(rating, topic, websiteName, websiteURL, dateLastVisited);
                webSiteList.add(currentWebsite);
                // System.out.print("\n=====WEBSITE=====");
                // System.out.println(currentWebsite);  
            }
            System.out.print("\nCreating list of Web sites visited ...");
        }catch(Exception e)
        {
            System.out.println("File Not Found Exception : "+ e);
        }
        finally{
            System.out.println("All is well");
        }
    }

    public int getMainMenuChoice()
    {
        scanner = new Scanner(System.in);
        System.out.println("/************************************************************************************************/");
        System.out.println("\n Welcome to the Doctor's collection of recently visited Web sites!"
        + "\n Choose an option."
        + "\n 1) Create Favorites Bar"
        + "\n 2) Delete Favorites Bar"
        + "\n 3) Add Web Site to Favorites Bar"
        + "\n 4) Remove Web Site from Favorites Bar"
        + "\n 5) Quit");
        System.out.print("Your choice?");
        int choice = scanner.nextInt();
        System.out.println("/************************************************************************************************/");
        return choice;
    }

    public int getSubMenuChoice()
    {
        System.out.print("\n Choose a topic."
        +"\n 1) Grocery shopping"
        +"\n 2) Science fiction"
        +"\n 3) Programming Language Training"
        +"\n 4) Clothes shopping"
        +"\n 5) Vegetables shopping"
        +"\n Your choice? ");
        int choice = scanner.nextInt();
        return choice;
    }

    public void chooseWebsite(String websiteName)
    {
        chosenWebsite = new ArrayList<Website>();
        System.out.print("\n Choose a topic.");
        int i=0;
        for(Iterator it = webSiteList.iterator(); it.hasNext(); i++)
        {
            Website w = (Website)it.next();
            if(w.getTopic().equals(websiteName))
            {
                chosenWebsite.add(i, w);
                System.out.print("\n " + (i+1) +") " +w.getwebsiteName());
            }
        }
        System.out.print("\n Your choice? ");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice ("+choice+") is being processed ...");
        addToFavoritesBar(chosenWebsite.get(choice-1));
    }
    public void addToFavoritesBar(Website w)
    {
        if (favoriteBar == null)
            favoriteBar = new ArrayList<Website>(); 
        favoriteBar.add(favoriteCount++,w);
    }

    public void displayFavoriteBar()
    {
        int i = 0;
        for(Iterator it = favoriteBar.iterator(); it.hasNext(); i++)
        {
            Website w = (Website)it.next();
            System.out.println("Selection #"+(i+1));
            System.out.println(w);
        }
    }
    public void removeWebsite()
    {
        System.out.println("Please enter the number of the selection you wish to remove.");
        System.out.println("Your choice?");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        favoriteBar.remove(choice-1);
        System.out.println("Your choice ("+choice+") is being processed ...");
        System.out.println("Selection #"+choice+" has been removed from the favorites bar.");    
    }

    public static void main(String[] args) 
    {
        FavoritesBarWithDriver bar = new FavoritesBarWithDriver();
        bar.createWebsiteList();  

        int choice=0;  
        int subChoice=0;
        int websiteChoice=0;

        do
        {
            choice = bar.getMainMenuChoice();
            switch (choice) 
            {
                case 1:
                    bar.favoriteBar = new ArrayList<Website>();
                    System.out.println("Favorites bar created!");
                    bar.displayFavoriteBar();
                    break;

                case 2:
                    System.out.println("Favorites bar contains entries."
                    +" Are you sure you want to delete it (Yes/No)?");
                    bar.scanner = new Scanner(System.in);
                    String chr = bar.scanner.nextLine();
                    if (chr.equalsIgnoreCase("Yes")) 
                    {
                        bar.favoriteBar = null;
                        System.out.println("Favorites bar Deleted!");
                    }
                    break;                

                case 3:
                    subChoice = bar.getSubMenuChoice();
                    System.out.println("Your choice ("+subChoice+") is being processed ...");
                    switch(subChoice)
                    {
                        case 1:
                            bar.chooseWebsite("Grocery shopping");
                            break;
                        case 2:
                            bar.chooseWebsite("Science fiction");
                            break;
                        case 3:
                            bar.chooseWebsite("Programming Language Training");
                            break;
                        case 4:
                            bar.chooseWebsite("Clothes shopping");
                            break;
                        case 5:
                            bar.chooseWebsite("Vegetables shopping");
                            break;
                    }
                    bar.displayFavoriteBar();
                    break;                

                case 4:
                    bar.displayFavoriteBar();
                    bar.removeWebsite();
                    bar.displayFavoriteBar();
                    break;                

                case 5:
                    bar.displayFavoriteBar();
                    System.out.println("Thanks for viewing the Doctor's collection of recently visited Web sites."
                    +"\nPlease visit again soon!");
                    break;                

                default:
                    System.out.println("Please enter proper choice.");
                    break;
            }
        }while(choice != 5);
    }
}
