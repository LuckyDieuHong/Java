import java.util.Scanner;

public class key {
    private static final int[] PC1 = {
        57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18,
        10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36,
        63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22,
        14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4
    };

    private static final int[] PC2 = {
        14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10,
        23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2,
        41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48,
        44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32
    };

    private static final int[] shifts = {
        1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1
    };

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("hex: ");
            String keyHex = scanner.nextLine();
            long key64 = Long.parseUnsignedLong(keyHex, 16);
            long key56 = permutate(key64, PC1, 64, 56);
            int c = (int) ((key56 >> 28) & 0xFFFFFFF);
            int d = (int) (key56 & 0xFFFFFFF);

            System.out.println("con:");
            for (int i = 0; i < 16; i++) {
                c = leftShift28(c, shifts[i]);
                d = leftShift28(d, shifts[i]);
                long cd = ((long) c << 28) | d;
                long subkey = permutate(cd, PC2, 56, 48);
                String binaryKey = Long.toBinaryString(subkey);
                while (binaryKey.length() < 48) {
                    binaryKey = "0" + binaryKey;
                }
                System.out.printf("Key %d: %s%n", i + 1, binaryKey);
                System.out.flush();  // Flush output to make sure it displays
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long permutate(long input, int[] table, int inputSize, int outputSize) {
        long output = 0;
        for (int i = 0; i < outputSize; i++) {
            int bit = inputSize - table[i];
            output = (output << 1) | ((input >> bit) & 1);
        }
        return output;
    }

    private static int leftShift28(int value, int shift) {
        int mask = 0xFFFFFFF; 
        return ((value << shift) | (value >> (28 - shift))) & mask;
    }
}
