class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int highalt=0;
        for(int i=0; i<=gain.length-1; i++){
            alt=alt+gain[i];
            highalt= Math.max(alt,highalt);
        }
        return highalt;
    }
}