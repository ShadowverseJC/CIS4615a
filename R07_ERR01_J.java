// Rule 07. Exceptional Behavior (ERR) - ERR01-J

public static void main(String[] args) {
    try {
        FileInputStream fis = new FileInputStream(System.getenv("APPDATA") + args[0]);
    } catch (FileNotFoundException e) {
        System.out.println("Invalid file");
        return;
    }
}
