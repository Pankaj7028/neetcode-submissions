class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            String hash = getHash(s);
            //System.out.println(hash);
            List<String> list = map.get(hash);
            if(list != null){
                list.add(s);
                map.put(hash,list);
            }
            else{
                list = new ArrayList<>();
                list.add(s);
                map.put(hash,list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> e : map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }

    public String getHash(String s){
        int arr[] =new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        return Arrays.toString(arr);
    }
}
