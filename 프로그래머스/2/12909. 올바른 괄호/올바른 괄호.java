class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1=0;
        int cnt2=0;
        
    if(s.charAt(0)==')'){
        answer = false;
    } else{
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt1++;
            } else{
                cnt2++;
            }
            if(cnt2>cnt1){
                answer = false;
                return answer;
            }
        }
        
        if(cnt1==cnt2){
            answer = true;
        } else{
            answer = false;
        }
    }

        return answer;
    }
}