class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
/*
class Solution {
    public boolean isHappy(int n) {
        var set = new HashSet<Integer>();

        while (true) {
            set.add(n);
            int number = 0;
            while (n != 0) {
                int digit = n % 10;
                n /= 10;
                number += digit * digit;
            }
            if (number == 1)
                return true;
            else if (set.contains(number))
                return false;
            else
                set.add(number);
            n = number;
        }
    }
}
*/