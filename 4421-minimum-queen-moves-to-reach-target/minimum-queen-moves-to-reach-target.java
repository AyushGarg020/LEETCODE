class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int sr = source[0], sc = source[1];
        int tr = target[0], tc = target[1];

        if(sr==tr && sc==tc)
            return 0;
        if(sr==tr || sc==tc || Math.abs(sr-tr) == Math.abs(sc-tc))
            return 1;

        return 2;
    }
}
/*
class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        if(source[0]==target[0] && source[1]==target[1])
            return 0;
        if(source[0]==target[1] && source[1]==target[0])
            return 1;
        if(source[0]==target[0] || source[1]==target[1])
            return 1;

        int diff1 = Math.abs(source[0]-target[0]);
        int diff2 = Math.abs(target[1]-source[1]);
        return diff2-diff1==0?1:2;
    }
}
*/