class Solution {
    public int minDistance(String word1, String word2) {
        int [][] editDistanceMatrix = new int[word1.length()+1][word2.length()+1];
        
        for ( int i = 0 ; i < editDistanceMatrix[0].length ; i ++){
            editDistanceMatrix[0][i] = i;
        }
        
        for ( int i = 1 ; i < editDistanceMatrix.length ; i ++){
            editDistanceMatrix[i][0] = i;
        }
        
        
  
        for (int i = 1 ; i < editDistanceMatrix.length ; i++){
            for (int j = 1; j < editDistanceMatrix[0].length ; j ++){
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    editDistanceMatrix[i][j] = editDistanceMatrix[i-1][j-1];
                } else {
                    editDistanceMatrix[i][j] = Math.min(Math.min(editDistanceMatrix[i-1][j-1],editDistanceMatrix[i][j-1]),editDistanceMatrix[i-1][j]) +1;
                }
            }
        }
   
        
        return editDistanceMatrix[word1.length()][word2.length()];
    }
}