package Array;
// Tutorial to show that we unsorted array 
// 

public class UnsortedArray {
	
	private int [] a;
	private int nElment ;

	public UnsortedArray(int max) {
		a = new int[max];
		nElment = 0;
	}

	public boolean find(int searchInt) {
		int j;
		for(j=1; j<nElment; j++) {
			if (a[j] == searchInt)
				break;
		}

		if (j == nElment)
				return false;
		else
			return true;
	}
	
	public void insert( int value) {
		a[nElment] = value;
		nElment++;
	}
	
	public boolean delete(int value) {
		int j;
		for(j=0; j<nElment; j++) {
			if (a[j] == value)
				break;
		}
		if (j == nElment) 
			return false;
		else
			{
				for(int k =j; k<nElment; k++ ) {
					a[k] = a[k+1];
				}
				nElment--;
				return true;
			}
	}
	
	public void display(){
		
		System.out.print("The array : ");

		for(int j = 0 ; j <= nElment ; j++) {
			System.out.print(a[j] + " "); 
		}
		System.out.println("");
	}
}
