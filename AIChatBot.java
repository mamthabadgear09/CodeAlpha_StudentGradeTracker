import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit");

        while (true) {

            System.out.print("\nYou: ");

            String message =
                    sc.nextLine()
                            .toLowerCase();

            if (
                    message.contains(
                            "hello"
                    )
            ) {

                System.out.println(
                        "Bot: Hello! How can I help you?"
                );

            }

            else if (
                    message.contains(
                            "your name"
                    )
            ) {

                System.out.println(
                        "Bot: My name is JavaBot"
                );

            }

            else if (
                    message.contains(
                            "java"
                    )
            ) {

                System.out.println(
                        "Bot: Java is an object-oriented programming language."
                );

            }

            else if (
                    message.contains(
                            "course"
                    )
            ) {

                System.out.println(
                        "Bot: Practice Java + Spring Boot + MySQL."
                );

            }

            else if (
                    message.contains(
                            "time"
                    )
            ) {

                System.out.println(
                        "Bot: I cannot access real time."
                );

            }

            else if (
                    message.equals(
                            "bye"
                    )
            ) {

                System.out.println(
                        "Bot: Goodbye!"
                );

                break;

            }

            else {

                System.out.println(
                        "Bot: Sorry, I don't understand."
                );

            }

        }

        sc.close();

    }

}