class Solution {
    public int twoEggDrop(int n) {
        int count = 1;
        while(n > 0){
            n -= count++;
        }
        
        return count-1;
    }
}
