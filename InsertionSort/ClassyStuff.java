
public class ClassyStuff {

	public static void sort(int a[])
	{
		int item, j;
		boolean bb;
		for (int k=1; k<a.length;k++)
		{
			item=a[k];
			j=k-1;
			bb=true;
			while((j>=0)&&bb)
			{
				if (item<a[j])
				{
					a[j+1]=a[j];
					j--;
				}
				if (j==-1)
				{
					a[0]=item;
				}
				else
					bb=false;
				a[j+1]=item;
			}
		}
	}

}
