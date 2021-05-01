package memory;

public class Main01_PassByValue {
    public static void main(String[] args) {
        int number = 65;
        System.out.println("1 - Number : " + number);
        changeNumber(number);
        System.out.println("3 - Number : " + number);
    }

    private static void changeNumber(int number) {
        number = 34;
        System.out.println("2 - Number : " + number);
    }
}
