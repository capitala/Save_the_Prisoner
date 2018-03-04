package org.chalenges.solutions.Save_the_Prisoner.service;

import org.springframework.stereotype.Service;

@Service
public class SolutionService {

	public int getSolution(String val) {
		String[] arr=val.split(" ");
		int n=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		int s=Integer.parseInt(arr[2]);
        int r=s+m-1;
       if(r<=n)
           return r;
       else if(r%n!=0)
           return r%n;
       else
       	return n;
	}

}
