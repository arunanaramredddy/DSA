package startProject;

public class LinearSearch {
	public static int linearSearch(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}

	
	
	
	public static void main(String[] args) {
		int[] a= {40,50,60,70,80};
		int key=70;
		System.out.println((linearSearch(a,key)));
		
	}

}
