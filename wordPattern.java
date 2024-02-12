class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();

        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
           if (hm1.containsKey(ch)) {
                if (!hm1.get(ch).equals(words[i])) {
                    return false;
                }
            } else {
                hm1.put(ch, words[i]);
            }

            if (hm2.containsKey(words[i])) {
                if (!hm2.get(words[i]).equals(ch)) {
                    return false;
                }
            } else {
                hm2.put(words[i], ch);
            }
        }

        return true;
    }
}
