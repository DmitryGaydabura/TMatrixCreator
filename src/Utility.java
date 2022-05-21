import java.util.Scanner;

public class Utility {
    public static int getM(){
        System.out.println("N:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getN(){
        System.out.println("M:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void printLogo() {
        System.out.println("""

                  __  __       _        _         _____                           _            \s
                 |  \\/  |     | |      (_)       / ____|                         | |           \s
                 | \\  / | __ _| |_ _ __ ___  __ | |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __\s
                 | |\\/| |/ _` | __| '__| \\ \\/ / | | |_ |/ _ \\ '_ \\ / _ \\ '__/ _` | __/ _ \\| '__|
                 | |  | | (_| | |_| |  | |>  <  | |__| |  __/ | | |  __/ | | (_| | || (_) | |  \s
                 |_|  |_|\\__,_|\\__|_|  |_/_/\\_\\  \\_____|\\___|_| |_|\\___|_|  \\__,_|\\__\\___/|_|  \s
                                                                                               \s
                                                                                               \s
                """);
    }
}
