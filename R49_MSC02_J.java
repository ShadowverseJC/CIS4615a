// Rule 49. Miscellaneous (MSC) - MSC02-J

Random number = new Random(123L);
for (int i = 0; i < 20; i++) {
    int n = number.nextInt(21);
    System.out.println(n);
}
