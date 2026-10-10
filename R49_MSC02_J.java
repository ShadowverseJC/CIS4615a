// Rule 49. Miscellaneous (MSC) - MSC02-J

SecureRandom number = new SecureRandom();
for (int i = 0; i < 20; i++) {
    int n = number.nextInt(21);
    System.out.println(n);
}
