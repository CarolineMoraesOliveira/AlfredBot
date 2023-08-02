import java.util.Date;

public class AlfredQuotes {
    
    // Alfred answers when he is turned on//

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    //Alfred answer when the person tells his/her name//
    
    public String guestGreeting(String name) {
        return String.format("Hello %s, it's a pleasure talk to you!", name);
    }

    //Alfred announces the date/hour //
    
    public String dateAnnouncement() {
        Date date = new Date ();
        return "Today is:" + date;
    }

    //Alfred answer depending if he listen "Alexis" or "Alfred" or none of those//

    public String respondBeforeAlexis(String conversation) {
        
        int a = conversation.indexOf ("Alexis");
        int b = conversation.indexOf ("Alfred");

        
        if (a == 0) {
            return String.format("Right away, sir. She certainly isn't sophisticated enough for that.");
        }
        else if (b == 29){
            return String.format("At your service. As you wish, naturally.");
        }
        else {
            return String.format("Right. And with that I shall retire.");
        }
    }

    //Alfred answer when he listen "meal"//
    
    public String guestFood(String conversation){

        int c = conversation.indexOf ("meal");
        
        if (c == 36) {
            return String.format("What's your favourite meal? i don't accept junkey food as a return!!!"); 
        }
        else {
            return String.format ("I don't understand you");
        }
    
    }
}


