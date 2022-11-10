import java.util.Scanner;
class ArrayOperations
{
public static void main(String [] args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of rows and columns of a matrix");
int rows=sc.nextInt();
int columns=sc.nextInt();
int a[][]=new int[rows][columns];
System.out.println("Enter elements into matrix ");
for(int i=0;i<rows;i++)
 {
for(int j=0;j<columns;j++)
 {
a[i][j]=sc.nextInt();
 }
 }
System.out.println("*****************************************************************");
System.out.println("The sum of each row of a matrix :");
System.out.println("*****************************************************************");
int b []=new int[rows];
for(int i=0;i<rows;i++)
 {
int sum=0;
for(int j=0;j<rows;j++)
 {
sum+=a[i][j];
 }
System.out.println("Sum of "+(i+1)+" row is "+sum);
for(int k=0;k<=i;k++)
 {
if(i==k)
 {
b[k]=sum;
 }
 }
 }
int max=b[0];
int c=0;
for(int l=1;l<rows;l++)
 {
if(b[l]>max)
 {
max=b[l];
c=l;
 }
 }
System.out.println("*****************************************************************");
System.out.println("The highest sum among all rows in a matrix is "+max+"of "+(c+1));
System.out.println("*****************************************************************");
System.out.println("The sum of all columns is ");
for(int i=0;i<rows;i++)
 {
int sum=0;
for(int j=0;j<columns;j++)
 {
sum+=a[j][i];
 }
System.out.println("The sum of "+(i+1)+" column is "+sum);
for(int k=0;k<=i;k++)
 {
if(i==k)
 {
b[k]=sum;
 }
 }
 }
max=b[0];
int d=0;
for(int l=1;l<rows;l++)
 {
if(b[l]>max)
 {
max=b[l];
d=l;
 }
 }
System.out.println("*****************************************************************");
System.out.println("The highest sum among all columns in a matrix is"+max+" of "+(d+1));
System.out.println("*****************************************************************");
int sum=0;
for(int i=0;i<rows;i++)
 {
for(int j=0;j<columns;j++)
 {
sum+=a[i][j];
 }
 }
System.out.println("The sum of all elements in matrix is "+sum);
 }
}
