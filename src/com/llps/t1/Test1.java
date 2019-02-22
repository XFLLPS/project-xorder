package com.llps.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		int[] ns= {1,2,3,4,5,6,7,8,9,10};		
		int nm = 3;
		int g_num = 3;
		int lens = 0;
		int last_num = 0;
		if(ns.length % nm == 0) {
			lens = ns.length / nm;
		}else {
			lens = ns.length / nm + 1;
			last_num = ns.length % nm;
		}
		
		for(int i=0;i<lens;i++) {
			if(i==lens-1) {
				g_num = last_num;
			}
			int[] datas= new int[g_num];
			System.arraycopy(ns, i*nm, datas, 0, g_num);
			for(int x: datas) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
