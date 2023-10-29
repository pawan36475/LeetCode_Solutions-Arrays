class Solution {
    public String restoreString(String s, int[] indices) {
        char copy[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            copy[indices[i]]=s.charAt(i);
        }
        return new String(copy);
    }
}