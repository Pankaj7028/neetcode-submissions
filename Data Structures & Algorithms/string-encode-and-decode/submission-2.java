class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            String number = "";
            while(str.charAt(i)!='#'){
                number+=str.charAt(i);
                i++;
            }
            int len = Integer.parseInt(String.valueOf(number));
            //System.out.println(len);
            String s = str.substring(i+1,i+len+1);
            //System.out.println(s);
            ans.add(s);
            i+=len+1;
        }
        return ans;
    }
}
