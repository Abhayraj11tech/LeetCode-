class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder sol = new StringBuilder();

        for (String word : words) {
            if (isPrice(word)) {
                double price = Double.parseDouble(word.substring(1));
                price = price - (price * discount / 100);
                String formattedPrice = String.format("$%.2f", price);
                sol.append(formattedPrice).append(" ");
            } else {
                sol.append(word).append(" ");
            }
        }

        return sol.toString().trim();
    }

    private boolean isPrice(String word) {
        return word.startsWith("$") && word.length() > 1 && word.substring(1).matches("\\d+");
    }
}
