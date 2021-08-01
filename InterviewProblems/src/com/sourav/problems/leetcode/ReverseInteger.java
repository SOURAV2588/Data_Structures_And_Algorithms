/**
 * 
 */
package com.sourav.problems.leetcode;

/**
 * @author dell
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int reverse(int x) {
	        
	        if( x < -Math.pow(2,31) || x > Math.pow(2,31)){
	            return 0;
	        }
	        
	        boolean isNegative = String.valueOf(x).charAt(0) == '-' ? true : false;
	        int unsignedValue = x;
	        if(isNegative){
	            unsignedValue = Integer.parseInt((String.valueOf(x)).substring(1));
	        }
	        int result = 0;
	        while(unsignedValue!=0){
	            result = result*10 + unsignedValue % 10;
	            unsignedValue = unsignedValue/10;
	        }
	        return result;
	    }

}
