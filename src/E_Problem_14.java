public class E_Problem_14 {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        String s = "";
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(result.length(), strs[i].length()); j++) {
                if (result.charAt(j) == strs[i].charAt(j)) {
                    s += result.charAt(j);
                } else
                    break;
            }
            result = s;
            s = "";
        }
        return result;
    }
}
