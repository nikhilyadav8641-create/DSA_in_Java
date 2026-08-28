class Solution {
    public boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            if (map1.containsKey(ch)) {
                int freq = map1.get(ch);
                map1.put(ch, freq + 1);
            } else
                map1.put(ch, 1);
        }
        for (char ch : s2.toCharArray()) {
            if (map2.containsKey(ch)) {
                int freq = map2.get(ch);
                map2.put(ch, freq + 1);
            } else
                map2.put(ch, 1);
        }
        // for (char ch : map1.keySet()) {
        // System.out.println(ch + " " + map1.get(ch));
        // }
        // System.out.println();
        // for (char ch : map2.keySet()) {
        // System.out.println(ch + " " + map2.get(ch));
        // }
        int flag = 1;
        if (map1.equals(map2)) {
            return true;
        } return false;
    }
}