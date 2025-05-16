public class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array:"+" ");
		int n =sc.nextInt();
		int  [] arr =new int [n];
		System.out.println("enter the n values :"+" ");
		for(int i=0;i< arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	}
}