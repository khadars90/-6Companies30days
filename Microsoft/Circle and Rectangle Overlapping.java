class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearx=Math.max(x1, Math.min(x2,xCenter));
        int neary=Math.max(y1, Math.min(y2,yCenter));

        int distanceX = xCenter - nearx;
        int distanceY = yCenter - neary;

        return distanceX*distanceX + distanceY*distanceY <= radius*radius;
    }
      public static void main(String[] args) {
        System.out.println(checkOverlap(1, 0, 0, 1, 0, 0, 1)); // true
    }
}
