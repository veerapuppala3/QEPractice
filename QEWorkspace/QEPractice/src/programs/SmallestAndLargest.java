package programs;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {8,12,22,3,3,5,9,20,28,13,1};
		int small = num[0];
		int big = num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<small)
				small=num[i];
			if(num[i]>big)
				big=num[i];
		}
		System.out.println(small);
		System.out.println(big);

	}

}
