public class PalindromSayiBulma {
    static boolean isPalindrom(int number){
        int temp = number , reverseNumber = 0, lastNumber;
        boolean result = true;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            if (reverseNumber == number){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(545));

    }
}
