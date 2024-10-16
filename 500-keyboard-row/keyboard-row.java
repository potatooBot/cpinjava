class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String[] a = words[i].toLowerCase().split("");
            boolean isValid = true;
            String temp = "";
            if (r1.contains(a[0])) {
                temp = r1;
            } else if (r2.contains(a[0])) {
                temp = r2;
            } else if (r3.contains(a[0])) {
                temp = r3;
            }

            for (int j = 1; j < a.length; j++) {
                if (!temp.contains(a[j])) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}