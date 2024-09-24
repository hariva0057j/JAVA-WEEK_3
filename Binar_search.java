import java.util.*;
class BS {
	public static void main(String args[]) {
		int a[] = {12, 23, 34, 45};
		int mid, key, flag = 0;
		int low = 0, high = a.length - 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("The Entered array is :");
		for(int i =0 ; i<a.length; i++)
		{
			System.out.println(+a[i]);
		}
		System.out.println("Enter the key you want to search :");
		key = sc.nextInt();
		while(low <= high) {
			mid  = (low+high)/2;
			if(key == a[mid]) {
				flag = 1;
				break;
			}
			else if(key  < a[mid]) {
				high = mid-1;
			}
			else {

				low = mid +1;
			}
		}
		if(flag == 1) {
			System.out.println("The key is found");
		}
		else
		{
			System.out.println("The key is not found");
		}
	}
}
