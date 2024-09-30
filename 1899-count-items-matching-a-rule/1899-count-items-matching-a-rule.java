class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = (ruleKey.charAt(0) == 't') ? 0 : ((ruleKey.charAt(0) == 'c') ? 1 : 2);
        return (int) items.stream().filter(item -> item.get(i).equals(ruleValue)).count();
    }
}
