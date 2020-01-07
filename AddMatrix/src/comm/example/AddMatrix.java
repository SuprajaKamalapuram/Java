package comm.example;

public class AddMatrix {
	int i,j,k,l,m,n;
	int arr1[][]=new int[5][5];
	int arr2[][]=new int[5][5];
	int arr3[][]=new int[5][5];

public void enterElements()	{
	
	System.out.println("enter elements of arr1");
	for(i=0;i<=5;i++)
	{
		for(j=0;j<=5;j++) {
			System.out.println(arr1[i][j]);
			
		}
	}

	System.out.println("enter elements of arr2");
	for(m=0;m<=5;m++)
	{
		for(n=0;n<=5;n++) {
			System.out.println(arr2[m][n]);
			
		}
}	
    System.out.println("addition is:");
    for(k=0;k<=5;k++) {
    	for(l=0;l<=5;l++) {
    		arr3[l][k]=arr1[i][j]+arr2[m][n];
    	}
    	
    }
    System.out.println(arr3[l][k]);
    

}
}


