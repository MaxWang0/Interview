class Interval{
	
	List<List<Integer>> list;
	List<Integer> last;
	public Interval(){
		list = new ArrayList<>();
		last = new ArrayList<>();
	}
	
	public void add(int x, int y){
		last.add(x);
		last.add(y);
		List<List<Integer>> res = new ArrayList<>();
		for(List ele:list){
			if(ele.get(0)>y){
				res.add(ele);
			}else if(ele.get(1)<x){
				res.add(ele;)
			}else{
				x = Math.min(x, ele.get(0));
				y = Math.max(y, ele.get(1));
			}
				
		}
		
		List<Integer> temp = new ArrayList<>();
		temp.add(x);
		temp.add(y);
		res.add(temp;)
		list = res;
		
	}
	
	public boolean find(int x){
		if (x>=last.get(0)||x<=last.get(1)) return true;
		
		return false;
	}

}
