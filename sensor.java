Class Solution{
      public boolean sensor(List<List<Integer>> sensors){
      
            if(sensors.size()==0) return true;
            
            for(int i = 0; i < sensors.size();i++){
                 if(sensors.get(i).get(0)==sensors.get(i).get(2)&&sensors.get(i).get(0)==sensors.get(i).get(1)){
                     return false;
                 }else if(sensors.get(i).get(0)==1-sensors.get(i).get(2)&&sensors.get(i).get(0)==1-sensors.get(i).get(1)){
                     return false;
                 }else if(sensors.get(i).get(0)<=sensors.get(i).get(2)||1-sensors.get(i).get(1)<=sensors.get(i).get(2)){
                     Set<List<Integer>> set = new HashSet<>();
                     set.add(sensors.get(i));
                     if(dfs(sensors, sensors.get(i), set)) return false;
                 }
                 return true;
            }
      }
      
      public boolean dfs(List<List<Integer>> sensors, List<Integer> list, Set<List<Integer>> set){
            if(1-list.get(0)<=list.get(2)||list.get(1)<=list.get(2)) return true;
            
            for(List<Integer> sensor:sensors){
                 if(set.add(sensor)){
                      if(Math.sqrt(Math.power(sensor.get(0)-list.get(0))+Math.power((sensor.get(1)-list.get(1)),2))<=sensor.get(2)+list.get(2)){
                          if(dfs(sensors, sensor, set)) return true;
                      }
                 }
            }
            
            return false;
      }
}
