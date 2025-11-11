class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;

        int numer = numer1 + numer2;
        int denom = denom1 * denom2;

        int max = Math.max(numer, denom);
        int min = Math.min(numer, denom);


        int gcd = gcd(numer, denom);

        numer /= gcd;
        denom /= gcd;

        return new int[]{numer, denom};
    }
}