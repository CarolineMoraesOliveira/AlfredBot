public class AlfredTest {
    
    public static void main(String[] args) {
        
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
            System.out.println(testGreeting);

        String testGuestGreeting = alfredBot.guestGreeting("Adam!");
            System.out.println(testGuestGreeting);
        
        String testDateAnnouncement = alfredBot.dateAnnouncement();
            System.out.println(testDateAnnouncement);
        
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
            System.out.println(alexisTest);

        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
            System.out.println(alfredTest);
        
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
            System.out.println(notRelevantTest);
        
        String testguestGreeting = alfredBot.guestGreeting ("Adam, good morning!");
            System.out.println(testguestGreeting);
        
        String testguestFood = alfredBot.guestFood ("I would like to know your favourite meal.");
            System.out.println(testguestFood);
    }
}
