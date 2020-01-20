package easy.string;

// https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingAnIpAddress_1108 {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder(address.length() + 6);
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}