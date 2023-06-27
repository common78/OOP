abstract class Encoder {
    abstract String encode(String str);
}

public class Leetspeak extends Encoder {
    public String encode(String str) {
        if (str == null) {
            return "";
        }

        StringBuilder encodedStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            encodedStr.append(encodeCharacter(c));
        }

        return encodedStr.toString();
    }

    private char encodeCharacter(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
                return '4';
            case 'e':
                return '3';
            case 'l':
                return '1';
            case 'm':
                return "/^^\\";
            case 'o':
                return '0';
            case 'u':
                return '(_)';
            default:
                return c;
        }
    }

    public static void main(String[] args) {
        Leetspeak leetspeak = new Leetspeak();
        String encodedStr = leetspeak.encode("Hello, World!");
        System.out.println(encodedStr); // Output: H3ll0, W0r1d!
    }
}
