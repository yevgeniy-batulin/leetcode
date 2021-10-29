package easy.array;

public class ShuffleString_1528 {
    public String restoreString(String s, int[] indices) {
        char[] restored = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            restored[indices[i]] = s.charAt(i);
        }
        return new String(restored);
    }
}
