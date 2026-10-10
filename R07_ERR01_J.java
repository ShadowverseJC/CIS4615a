// Rule 07. Exceptional Behavior (ERR) - ERR01-J

public static void main(String[] args) throws FileNotFoundException {
    FileInputStream fis =
        new FileInputStream(System.getenv("APPDATA") + args[0]);
}
