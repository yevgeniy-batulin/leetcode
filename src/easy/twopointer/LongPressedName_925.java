package easy.twopointer;

public class LongPressedName_925 {
    public boolean isLongPressedName(String name, String typed) {
        int nameIndex = 0;
        for (int typedIndex = 0; typedIndex < typed.length(); typedIndex++) {
            if (nameIndex < name.length() && name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                nameIndex++;
            } else if (typedIndex == 0 || typed.charAt(typedIndex) != typed.charAt(typedIndex - 1)) {
                return false;
            }
        }
        return nameIndex == name.length();
    }

    public boolean isLongPressedNameAlternative(String name, String typed) {
        int typedIndex = 0;
        for (int nameIndex = 0; nameIndex < name.length(); nameIndex++, typedIndex++) {
            if (typedIndex == typed.length() || name.charAt(nameIndex) != typed.charAt(typedIndex)) {
                return false;
            }

            int namedIndexMoved = 0;
            int typedIndexMoved = 0;

            while (nameIndex < name.length() - 1 && name.charAt(nameIndex) == name.charAt(nameIndex + 1)) {
                nameIndex++;
                namedIndexMoved++;
            }

            while (typedIndex < typed.length() - 1 && typed.charAt(typedIndex) == typed.charAt(typedIndex + 1)) {
                typedIndex++;
                typedIndexMoved++;
            }

            if (typedIndexMoved < namedIndexMoved) {
                return false;
            }
        }
        return typedIndex == typed.length();
    }

    public static void main(String[] args) {
        new LongPressedName_925().isLongPressedName("saeed", "ssaaedd");
    }
}
