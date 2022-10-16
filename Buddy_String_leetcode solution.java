class Solution {
    public boolean buddyStrings(String s, String goal) {
      
        if(s.length() == 1){
            return false;
        }
        
        int count = 0;
        
        boolean flag = true;
        for(int i=0;i<s.length()-1;i++){ 
            if(s.charAt(i) != s.charAt(i+1)){
                flag = false;
            }else{
                count++;
            }
        }
        
        if(flag){
            return true;
        }
        
        if(s.length() < 3 && s.equals(goal)){
            return false;
        }else if(s.length() >= 3 && s.equals(goal) && count >= 2){
            return true;
        }
        
        
        for(int i=0;i<s.length()-1;i++){    
            if(s.charAt(i)!=s.charAt(i+1)){
                for(int j=i+1;j<s.length();j++){

                    char temp[] = s.toCharArray();

                    char tempEle = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tempEle;

                    String newString = new String(temp);

                    if(newString.equals(goal)){
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
