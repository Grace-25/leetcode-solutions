class Solution {
    public String decodeString(String s) {
        Stack<Integer> countstack=new Stack<>();
        Stack<String> stringstack=new Stack<>();
         int num=0;
         String current="";
         for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+ch-'0';
            }
            else if(ch=='['){
                countstack.push(num);
                stringstack.push(current);
                num=0;
                current="";
            }
            else if(ch==']'){
                int count=countstack.pop();
                String previous=stringstack.pop();
                 
                 String temp="";
                 for(int i=0;i<count;i++){
                    temp=temp+current;
                 }
                 current=previous+temp;
            }
            else{
                current=current+ch;
            }
         }
         return current;

    }
}