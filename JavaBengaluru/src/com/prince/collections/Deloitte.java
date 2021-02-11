package com.prince.collections;
import java.util.Scanner;

public class Deloitte {
public static int[] funcDistance(int[] inputDist,int start,int end){
	int[] answer =new int[100];
	int a=0;
	for(int i=0; i<inputDist.length-1;i++) {
		if(inputDist[i]<end && inputDist[i]>start) {
			answer[a]=inputDist[i];
			a++;
		}
	}
	return answer;
}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int inputDistSize = in.nextInt();
	int inputDist[] = new int[inputDistSize];
	for(int idx=0; idx< inputDistSize; idx++) {
		inputDist[idx]=in.nextInt();		
	}
	int start =in.nextInt();
	int end =in.nextInt();
	int[] result = funcDistance(inputDist, start, end);
	for(int idx=0; idx<result.length-1; idx++) {
		if(result[idx]!=0) {
		System.out.print(result[idx]+" ");
	}
	}
	
}
}
