class Remove K Digits{
    public String removeKdigits(String num, int k) {
        if (num.length() <= k)
            return "0";
        int n = num.length();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && k > 0 && ((stk.peek() - '0') > (num.charAt(i) - '0'))) {
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
        }
        while (k > 0 && !stk.isEmpty()) {
            stk.pop();
            k--;
        }

        if (stk.isEmpty()) return "0";

        StringBuilder res = new StringBuilder();
        while (!stk.isEmpty()) {
            res.append(stk.pop());
        }

        res.reverse();

        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        if (res.length() == 0) return "0";
        return res.toString();
        
    }
}