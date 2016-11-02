public static String[] isArithmetic(int[] arr, int[][] ques){
		String[] res = new String[ques.length]; 
		Arrays.fill(res, "N");
		if(arr.length<=1) return res;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, Integer.MIN_VALUE);
		map.put(1, 0);
		int diff = arr[1]-arr[0];
		int index = 0;
		for(int i = 1; i < arr.length-1; i++){
			if(arr[i+1]-arr[i]!=diff){
				map.put(i+1, i);
				index = i;
				diff = arr[i+1]-arr[i];
			}else{
				map.put(i+1, index);
			}
		}
		for(int i = 0 ;i < ques.length; i++){
			if(map.get(ques[i][1]-1)<=ques[i][0]-1){
				res[i]="Y";
			}
			System.out.println(res[i]);
		}
		
		return res;
		
	}
