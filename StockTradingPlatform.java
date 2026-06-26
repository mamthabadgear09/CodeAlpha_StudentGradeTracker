import java.util.*;

public class StockTradingPlatform {

    static class Stock {

        String company;
        double price;

        Stock(String company, double price) {
            this.company = company;
            this.price = price;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Stock> market =
                new ArrayList<>();

        market.add(
                new Stock(
                        "TCS",
                        3800
                )
        );

        market.add(
                new Stock(
                        "INFY",
                        1800
                )
        );

        market.add(
                new Stock(
                        "WIPRO",
                        550
                )
        );

        double balance =
                100000;

        while (true) {

            System.out.println(
                    "\n1 View Market"
            );

            System.out.println(
                    "2 Buy"
            );

            System.out.println(
                    "3 Exit"
            );

            int choice =
                    sc.nextInt();

            if (choice == 1) {

                for (
                        int i = 0;
                        i < market.size();
                        i++
                ) {

                    System.out.println(

                            (i + 1)
                                    + " "
                                    + market.get(i).company
                                    + " ₹"
                                    + market.get(i).price

                    );

                }

            }

            else if (
                    choice == 2
            ) {

                System.out.print(
                        "Select Stock: "
                );

                int index =
                        sc.nextInt();

                Stock s =
                        market.get(
                                index - 1
                        );

                if (
                        balance
                                >=
                                s.price
                ) {

                    balance -=
                            s.price;

                    System.out.println(
                            "Purchased "
                                    +
                                    s.company
                    );

                    System.out.println(
                            "Balance ₹"
                                    +
                                    balance
                    );

                }

                else {

                    System.out.println(
                            "Not Enough Money"
                    );

                }

            }

            else {

                break;

            }

        }

        sc.close();

    }

}