import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO

        boolean functionare = true;
        int sold = 1000;
        int retragere;
        int depunere;
        System.out.println("===== Bine ati venit =====\n" +
                "Optiuni disponibile:\n" +
                "\t1. Interogare Sold\n" +
                "\t2. Retragere Numerar\n" +
                "\t3. Depunere\n" +
                "\t4. Curs Valutar\n" +
                "\t5. Info\n" +
                "\t6. Iesire\n");
        int optiune = scanner.nextInt();
        while (functionare) {
            switch (optiune) {
                case 1:
                    System.out.println("Soldul dumneavoastra este " + sold + " RON.\n");
                    optiune = scanner.nextInt();
                    break;
                case 2:
                    retragere = scanner.nextInt();
                    if (retragere > 0 && retragere % 10 == 0 && retragere <= sold) {
                        sold -= retragere;
                        System.out.println("Operatie efectuata cu succes!\n");
                        optiune = scanner.nextInt();
                    } else if (retragere < 0 || retragere % 10 != 0 || retragere > sold) {
                        System.out.println("Valoare invalida!\n");
                        optiune = scanner.nextInt();
                    }
                    break;
                case 3:
                    depunere = scanner.nextInt();
                    if (depunere > 0 && depunere % 10 == 0) {
                        sold += depunere;
                        System.out.println("Operatie efectuata cu succes!\n");
                        optiune = scanner.nextInt();
                    } else if (depunere < 0 || depunere % 10 != 0) {
                        System.out.println("Valoare invalida!\n");
                        optiune = scanner.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("Cursul valutar: 1 EUR = 5 RON\n");
                    optiune = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Numele bancii: DevBank\n");
                    optiune = scanner.nextInt();
                    break;
                case 6:
                    functionare = false;
                    break;
                default:
                    System.out.println("Optiuni disponibile:\n" +
                            "\t1. Interogare Sold\n" +
                            "\t2. Retragere Numerar\n" +
                            "\t3. Depunere\n" +
                            "\t4. Curs Valutar\n" +
                            "\t5. Info\n" +
                            "\t6. Iesire\n");
                    optiune = scanner.nextInt();
                    break;
            }
        }
    }
}