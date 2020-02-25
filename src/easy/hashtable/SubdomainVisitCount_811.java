package easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/subdomain-visit-count/
class SubdomainVisitCount_811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String countAndDomain : cpdomains) {
            int whitespaceIndex = 0;
            while (!Character.isWhitespace(countAndDomain.charAt(whitespaceIndex))) whitespaceIndex++;
            int count = Integer.parseInt(countAndDomain.substring(0, whitespaceIndex));

            String domain = countAndDomain.substring(whitespaceIndex + 1);
            map.put(domain, map.getOrDefault(domain, 0) + count);
            for (int domainIndex = 1; domainIndex < domain.length(); domainIndex++) {
                if (domain.charAt(domainIndex) == '.') {
                    String subDomain = domain.substring(domainIndex + 1);
                    map.put(subDomain, map.getOrDefault(subDomain, 0) + count);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue().toString() + " " + entry.getKey());
        }
        return result;
    }
}