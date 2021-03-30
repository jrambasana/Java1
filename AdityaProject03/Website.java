
public class Website
{
    private String rating, topic, websiteName, websiteURL, dateLastVisited;
    
    public Website(String rating, String topic, 
                String websiteName, String websiteURL,
                String dateLastVisited)
    {
        this.rating = rating;    
        this.topic = topic;
        this.websiteName = websiteName;
        this.websiteURL = websiteURL;
        this.dateLastVisited = dateLastVisited;   
    }

    public String toString()
    {
        return "" + 
        "\n Rating: " + rating + 
        "\n Topic: " + topic + 
        "\n Web Site Name: " + websiteName + 
        "\n Web Site Address: " + websiteURL + 
        "\n Date Last Visited: " + dateLastVisited ;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getwebsiteName() {
        return websiteName;
    }
    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }
    public String getwebsiteURL() {
        return websiteURL;
    }
    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }
    public String getDateLastVisited() {
        return dateLastVisited;
    }
    public void setDateLastVisited(String dateLastVisited) {
        this.dateLastVisited = dateLastVisited;
    }
    
}