class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
       char[] e=s.toCharArray();
       for(int i=0;i<e.length;i++){
        if(Character.isDigit(e[i])){
            if(res.length()>0){
                res.deleteCharAt(res.length()-1);
            }
           
        }
        else{
            res.append(e[i]);
        }

       }
      return res.toString();
       
    }
}