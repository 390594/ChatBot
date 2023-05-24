import java.util.Scanner; //import Scanner Class
public class Chatbot {
    public static void main(String[] args) {
        System.out.println("Hi,my name is Alexander Graham Bell. Please ask me questions");
        System.out.println("Where are you from?");
        System.out.println("What was your profession?");
        System.out.println("What did you invent?");
        System.out.println("Do you have children?");
        boolean keepgoing = true;

        while(keepgoing){
            Scanner scanner = new Scanner(System.in);
            Scanner string = new Scanner(System.in);
            String question = string.nextLine();
            if (question.equals("Where are you from?")) {
                System.out.println("I was born in Edinburgh,the capital of Scotland");
            }
            else if (question.equals("What was your profession?")){
                System.out.println("Throughout my life I served as a talented inventor");
            }
            else if (question.equals("What did you invent?")){
                System.out.println("Do you know what a telephone is? Yes! I invented the now common form of communication");
            }
            else if (question.equals("Do you have children?")){
                System.out.println("I fathered 4 children. Marian Hubbard Bell, Elsie Bell, Edward Bell, Robert Bell");
            }
            else {
                System.out.println("please enter a question from the list") ;
            }

        }
    }
}

