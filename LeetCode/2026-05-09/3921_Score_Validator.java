class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length;
        int ans[] = new int[2];

        int score = 0;
        int counter = 0;
        int i = 0;
        while(n > i && counter <= 9){
            if(events[i].equals("0") || events[i].equals("1") || 
               events[i].equals("2") || events[i].equals("3") || 
               events[i].equals("4") || events[i].equals("6")){
                score += Integer.parseInt(events[i]);
               }
            else if (events[i].equals("WD") || events[i].equals("NB")) score++;

            else if(events[i].equals("W")) counter++;

            i++;
        }
        ans[0] = score;
        ans[1] = counter;
        return ans;
    }
}