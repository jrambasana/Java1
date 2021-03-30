package Assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class WebsiteManager {
    ArrayList<Website> webSiteList = null;
    Website currentWebsite;
    Scanner scanner;
    String currentLine="";

    public void createWebsiteList()
    {
        webSiteList = new ArrayList<Website>();
        try
        {
            File directory = new File("/");
            System.out.println("Path: " + directory.getAbsolutePath());
            scanner = new Scanner(new FileInputStream(directory.getAbsolutePath()+"websiters.txt"));
            while(scanner.hasNext())
            {
                currentLine = scanner.nextLine();
                if(currentLine.equals("****") && scanner.hasNext())
                {
                    String rating, topic, websiteName, websiteURL, dateLastVisited; 
                    rating = scanner.nextLine();
                    topic = scanner.nextLine();
                    websiteName = scanner.nextLine();
                    websiteURL = scanner.nextLine();
                    dateLastVisited = scanner.nextLine();   
                    currentWebsite = new Website(rating, topic, websiteName, websiteURL, dateLastVisited);
                    webSiteList.add(currentWebsite);
                }
                for(Iterator it = webSiteList.iterator() ; it.hasNext() ;)
                {
                    Website w = (Website)it.next();
                    System.out.println("=====WEBSITE=====");
                    System.out.println(w);
                }
                
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("File Not Found Exception : "+ e);
        }
        finally{
            System.out.println("All is well");
        }
    }
    public static void main(String[] args) 
    {
        WebsiteManager wm1 = new WebsiteManager();
        wm1.createWebsiteList();       
    }
}
