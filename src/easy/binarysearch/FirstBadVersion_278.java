package easy.binarysearch;

public class FirstBadVersion_278 extends VersionControl {
    public int firstBadVersion(int n) {
        return internal(1, n);
    }

    private int internal(int start, int end) {
        if (start == end) return start;
        int mid = start + (end - start) / 2;
        if (isBadVersion(mid)) {
            return internal(start, mid);
        } else {
            return internal(mid + 1, end);
        }
    }
}

class VersionControl {
    // This is a stub
    boolean isBadVersion(int i) {
        return true;
    }
}