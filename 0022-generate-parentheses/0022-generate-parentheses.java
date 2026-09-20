class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate("",0,0,n,list);
        return list;
    }
    void generate(String s,int open,int close,int n,List<String> list){
        if(s.length()==2*n){
           list.add(s);
          return;
        }
        if(open<n){
            generate(s+"(",open+1,close,n,list);
        }
        if(close<open){
            generate(s+")",open,close+1,n,list);
        }
         
    }
}