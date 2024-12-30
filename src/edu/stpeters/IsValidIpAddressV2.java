package edu.stpeters;

public class IsValidIpAddressV2 {
	public static void main(String[] args) {
		String input ="172.001.154.1";
		
		
		String[]data = getArrayEle(input);
		int num=0;
		boolean isValid =false;
		if(data.length==4)
		{
			for(int i=0;i<data.length;i++) {
				num = Integer.parseInt(data[i]);
				if((num>=0)&&(num<=255)) {
					isValid = true;
				}
				else {
					isValid=false;
					break;
				}
				
			}
		}
		if(isValid == true) {
			System.out.println("Valid IPv4 Address");
			
		}
	}

}

