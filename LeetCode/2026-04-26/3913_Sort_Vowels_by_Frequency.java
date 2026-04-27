class Solution {
    public boolean vow(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public String sortVowels(String s) {
        HashMap<Character, Integer> frq = new HashMap<>();
        HashMap<Character, Integer> first = new HashMap<>();

        List<Character> vowels = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(vow(ch)){
                vowels.add(ch);
                frq.put(ch, frq.getOrDefault(ch,0)+1);
            }
            if(!first.containsKey(ch)){
                first.put(ch, i);
            }
        }
        Collections.sort(vowels, (a,b) -> {
            if(frq.get(a).equals(frq.get(b))) return first.get(a) - first.get(b);;

            return frq.get(b) - frq.get(a);
        });
        
        StringBuilder sb = new StringBuilder(s);
        int idx = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(vow(ch)){
                sb.setCharAt(i, vowels.get(idx++));
            }
        }
        return sb.toString();
    }
}