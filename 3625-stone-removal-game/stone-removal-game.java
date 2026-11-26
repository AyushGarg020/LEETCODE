class Solution {
    public boolean canAliceWin(int n) {
        int move = 10;
        int round = 0;
        boolean alice = true;
        boolean bob = true;

        while(n>0) {
            if(n-move==0) {
                if(round%2==0)
                    return true;
                else
                    return false;
            }
            else if(n-move<0) {
                if(round%2==0)
                    return false;
                else
                    return true;
            }
            n-=move;
            move--;
            round++;
        }

        return true;
    }
}
/*
class Solution {
    public boolean canAliceWin(int n) {
        int stones = n;
        int remove = 10;
        int turns = 0;

        while (stones >= remove) {
            stones -= remove;
            remove--;
            turns++;
        }

        return turns % 2 == 1;
    }
}
*/