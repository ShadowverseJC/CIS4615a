// Rule 13. Input Output (FIO) - FIO08-J

FileInputStream in;
int inbuff;
byte data;
while ((inbuff = in.read()) != -1) {
    data = (byte) inbuff;
    // ...
}
