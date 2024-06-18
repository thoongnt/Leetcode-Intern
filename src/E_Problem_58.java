public class E_Problem_58 {
    public int lengthOfLastWord(String s) {
        String[] strings = s.trim().split(" ");
        return strings[strings.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
