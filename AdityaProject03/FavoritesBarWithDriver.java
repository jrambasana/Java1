
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FavoritesBarWithDriver {
    ArrayList<Website> webSiteList = null;
    Website currentWebsite;
    Scanner scanner;
    String currentLine="";

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
        System.out.println("\n Welcome to the Doctor's collection of recently visited Web sites!"
        + "\n Choose an option."
        + "\n 1) Create Favorites Bar"
        + "\n 2) Delete Favorites Bar"
        + "\n 3) Add Web Site to Favorites Bar"
        + "\n 4) Remove Web Site from Favorites Bar"
        + "\n 5) Quit");
        System.out.print("Your choice?");
        int choice = scanner.nextInt();
        return choice;
    }
    public static void main(String[] args) 
    {
        FavoritesBarWithDriver bar = new FavoritesBarWithDriver();
        bar.createWebsiteList();  
        int choice = bar.getMainMenuChoice();   
          
    }
}
