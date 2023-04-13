import java.util.*;
class Union{
static void Unions(int arr[],int brr[],int n,int m){
int i=0,j=0,k=0;
int []result= new int[n+m];
while(i<n&&j<m){
if(arr[i]<brr[j]){
if(k!=0&&arr[i]==result[k-1]){
i++;
}else{
result[k]=arr[i];
i++;
k++;
}
}else{
if(k!=0&&brr[j]==result[k-1]){
j++;
}else{
result[k]=brr[j];
j++;
k++;
}
}
}
while(i<n){
if(k!=0&&arr[i]==result[k-1]){
i++;
}else{
result[k]=arr[i];
i++;
k++;
}
}

while(j<m){
if(k!=0&&brr[j]==result[k-1]){
j++;
}else{
result[k]=brr[j];
j++;
k++;
}
}

System.out.print("Union of two array : ");
for(int l=0;l<k;l++){
System.out.print(result[l] + " ");
}
}
static void Intersection(int arr[],int brr[],int n,int m){
int i=0,j=0,k=0,l=0;
int []result=new int[n+m];
while(i<n&&j<m){
if(arr[i]<brr[j]){
i++;
}else if(arr[i]>brr[j]){
j++;
}
else{
if(k!=0&&arr[i]==result[k-1]){
i++;
j++;
}else{
result[k]=arr[i];
i++;
j++;
k++;
}
}
}
System.out.print("Intersection of two array : ");
for( l=0;l<k;l++){
System.out.print(result[l] + " ");
}
}
public static void main(String args[]){
int arr[],brr[];
arr = new int[5];
brr = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 element of First array : " );
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter 5 element of Second array : " );
for(int i=0;i<5;i++){
brr[i]=sc.nextInt();
}
Arrays.sort(arr);

Arrays.sort(brr);
int n= arr.length;
int m = brr.length;
  Unions(arr,brr,n,m);
Intersection(arr,brr,n,m);
}

}