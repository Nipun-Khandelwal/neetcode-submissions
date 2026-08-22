
class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map1=new HashMap<>();
      HashMap<Character,Integer> map2=new HashMap<>();
      if(s.length()!=t.length()){
        return false;
      }
      for(int i=0;i<s.length();i++){
        char m=s.charAt(i);
        if(map1.containsKey(m)){
          int freq=map1.get(m);
          map1.put(m,freq+1);
        }
        else{
          map1.put(m,1);
        }
      }
      for(int i=0;i<s.length();i++){
        char m=t.charAt(i);
        if(map2.containsKey(m)){
          int freq=map2.get(m);
          map2.put(m,freq+1);
        }
        else{
          map2.put(m,1);
        }
      }
      for(char ele:map1.keySet()){
        if(!map1.get(ele).equals(map2.get(ele))){
          return false;
        }
      }
      return true;
    }
}
