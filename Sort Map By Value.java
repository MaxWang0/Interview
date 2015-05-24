import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
 
public class Solution {
	public static void main(String[] args){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try{
			BufferReader weblog = new BufferReader(new FileReader("src/access1.log"));
			String line = null;
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			while (( line = weblog.readline()) != null
			{
				String parts = line.split("\t");
				if( map.containsKey(parts[4])) {
					map.get(parts[4], map.get(key) + 1);
				}else{
					map.put(parts[4], map.get(key) + 1);
				}
				}
			}
			catch(IOException ex) {
				System.out.println("Error in connection: " + ex.getMessage());
				
			}

		}
	
		System.out.println(map);
 
		TreeMap<String, Integer> sortedMap = SortByValue(map);  
		System.out.println(sortedMap);
	}
 
	public static TreeMap<String, Integer> SortByValue 
			(HashMap<String, Integer> map) {
		ValueComparator vc =  new ValueComparator(map);
		TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(vc);
		sortedMap.putAll(map);
		return sortedMap;
	}
}
 
class ValueComparator implements Comparator<String> {
 
    Map<String, Integer> map;
 
    public ValueComparator(Map<String, Integer> base) {
        this.map = base;
    }
 
    public int compare(String a, String b) {
        if (map.get(a) >= map.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys 
    }
}
