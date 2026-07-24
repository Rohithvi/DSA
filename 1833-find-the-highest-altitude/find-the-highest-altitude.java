class Solution {
    public int largestAltitude(int[] gain) {
        int Altitude = 0;
        int MaxAltitude =0;
        for (int g : gain){
            Altitude += g;
            MaxAltitude = Math.max(MaxAltitude, Altitude);
        }
        return MaxAltitude;
    }
}