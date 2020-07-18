package easy.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder emailBuilder = new StringBuilder();
            int atIndex = email.indexOf('@');
            for (int i = 0; i < atIndex; i++) {
                char c = email.charAt(i);
                if (Character.isLetterOrDigit(c))
                    emailBuilder.append(c);
                if (c == '+')
                    break;
            }
            emailBuilder.append(email.substring(atIndex));
            set.add(emailBuilder.toString());
        }
        return set.size();
    }
}
