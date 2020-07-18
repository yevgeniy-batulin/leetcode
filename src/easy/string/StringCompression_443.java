package easy.string;

class StringCompression_443 {
    public static void main(String[] args) {
        System.out.println(new StringCompression_443().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
//        System.out.println(new StringCompression_443().compress(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}));
    }

    public int compress(char[] chars) {
        int start = 0;
        char current = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (current != chars[i]) {
                fillCount(chars, start, i - 1);
                current = chars[i];
                start = i;
            }
        }
        fillCount(chars, start, chars.length - 1);

        int size = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0)
                chars[size++] = chars[i];
        }
        return size;
    }

    private void fillCount(char[] chars, int start, int end) {
        int x = 43;
        int count = end - start + 1;
        for (int i = end; i > start; i--) {
            if (count > 0) {
                chars[i] = (char) (count % 10 + '0');
                count /= 10;
            } else {
                chars[i] = 0;
            }
        }
    }
}