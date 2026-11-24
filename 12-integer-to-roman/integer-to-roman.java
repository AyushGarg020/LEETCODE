class Solution {
    public String intToRoman(int num) {
        String str[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int nums[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(num!=0) {
            if(num>=nums[count]) {
                num-=nums[count];
                sb.append(str[count]);
            }
            else
                count++;
        }
        return sb.toString();
    }
}
/*class Solution {
    public String intToRoman(int num) {
        List<String> symbols = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> values= List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<symbols.size(); i++) {
            while(num>=values.get(i)) {
                num-=values.get(i);
                sb.append(symbols.get(i));
            }
        }
        return sb.toString();
    }
}*/