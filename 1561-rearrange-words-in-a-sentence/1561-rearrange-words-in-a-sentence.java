class Solution {
    public String arrangeWords(String text) {
        ArrayList<String> string = new ArrayList<>();
        StringBuilder chk = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (chk.length() > 0) {
                    string.add(chk.toString());
                    chk.setLength(0);
                }
            } else {
                chk.append(Character.toLowerCase(text.charAt(i)));
            }
        }
        
        if (chk.length() > 0) {
            string.add(chk.toString());
        }

        List<Pair<String, Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < string.size(); i++) {
            pairs.add(new Pair<>(string.get(i), i));
        }

        pairs.sort(Comparator.comparingInt((Pair<String, Integer> p) -> p.getKey().length())
                            .thenComparingInt(Pair::getValue));

        StringBuilder sol = new StringBuilder();
        for (int i = 0; i < pairs.size(); i++) {
            sol.append(pairs.get(i).getKey());
            if (i != pairs.size() - 1) {
                sol.append(" ");
            }
        }

        String res = sol.toString();
        if (!res.isEmpty()) {
            res = Character.toUpperCase(res.charAt(0)) + res.substring(1);
        }

        return res;
    }

  }