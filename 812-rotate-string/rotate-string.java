class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;

        int n = s.length();

        for (int idx = 0; idx < n; idx++) {

            if (s.equals(goal.substring(idx) + goal.substring(0, idx)))
                return true;
        }

        return false;
    }
}