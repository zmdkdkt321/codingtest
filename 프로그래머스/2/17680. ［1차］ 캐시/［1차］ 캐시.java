import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5*cities.length;
        
        int answer = 0;
        int[] intCities = new int[cities.length];
        Map<String,Integer> cache = new HashMap<>();
        int cityNumber = 1;
        String upperCity;
        for(int i = 0; i < cities.length; i++){
            upperCity = cities[i].toUpperCase();
            cache.put(upperCity,cache.getOrDefault(upperCity,cityNumber++));
            intCities[i] = cache.get(upperCity);
        }
        List<Integer> list = new ArrayList<>();
        
        for(Integer i :intCities){
            if(list.contains(i)){
                list.remove(i);
                answer+=1;
            }else{
                if(list.size() == cacheSize){
                    list.remove(0);
                }
                answer+=5;
            }
            list.add(i);
        }
        return answer;
    }
}