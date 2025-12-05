class Solution {
    public boolean isPossible(int[] nums) {


        HashMap<Integer, Integer> fre = new HashMap<>();
        HashMap<Integer, Integer> need = new HashMap<>();

        for(int i : nums){
            fre.put(i , fre.getOrDefault(i,0)+1);
        }


        for(int x : nums){
            if(fre.getOrDefault(x,0) == 0){
                continue;
            }

            fre.put(x, fre.get(x)-1);
            if(need.getOrDefault(x, 0) > 0){
                need.put(x, need.getOrDefault(x,0) - 1);
                need.put(x+1 , need.getOrDefault(x+1 ,0) + 1);

            }else if(fre.getOrDefault(x+1, 0) > 0 && fre.getOrDefault(x+2, 0) > 0){
                    fre.put(x+1 ,fre.get(x+1) -1);
                    fre.put(x+2, fre.get(x+2) -1);
                    need.put(x+3, need.getOrDefault(x+3,0)+1);

            }else{
                return false;
            }
        }

        return true;


    }
}
