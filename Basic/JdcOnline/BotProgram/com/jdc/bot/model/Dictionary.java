package.com.jdc.bot.model;

public class Dictionary {


    private Conversation[] conversations = {};
    public String Search(String question){
        for (var conversation : conversations){
            if (conversation.question().equalsIgnoreCase(question)){
                return conversation.answer();
            }
        }
        return null;
    }
    public void register(Convervation convervation){
        convervations = Arrays.copyOf(convervations, convervations.length + 1);
        conversations[convervations.length - 1] = convervation;

    }
}