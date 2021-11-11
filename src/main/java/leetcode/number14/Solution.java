package leetcode.number14;


class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";

        if (strs.length == 1) {
            return strs[0];
        }

        if (strs.length <= 1) {
            return res;
        }

        for (int i = 0; i < strs.length; i++) {
            int nextIndex = i + 1;

            if (nextIndex > strs.length - 1) {
                break;
            }

            String currentWord = strs[i];
            String nextWord = strs[nextIndex];
            String iterableWord = currentWord.length() > nextWord.length() ? nextWord : currentWord;
            StringBuilder tmpRes = new StringBuilder();

            if (iterableWord.length() == 0) {
                return "";
            }

            for (int j = 0; j < iterableWord.length(); j++) {
                if (currentWord.charAt(j) != nextWord.charAt(j) && j == 0) {
                    return "";
                }
                if (currentWord.charAt(j) == nextWord.charAt(j)) {
                    tmpRes.append(iterableWord.charAt(j));
                } else {
                    break;
                }
            }
            if (res.length()!=0 && tmpRes.length() > res.length()) {
                continue;
            }
            res = tmpRes.toString();
        }
        return res;
    }
}