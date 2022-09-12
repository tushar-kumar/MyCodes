#include<bits/stdc++.h>
using namespace std;
void merge(int a[],int low,int mid,int high)
{
    int b[10] ={0};
    int k=0;
    int i=low,j=mid+1;
    
    while(i<=mid&&j<=high)
    {
        if(a[i]<=a[j])
        {
            b[k++] = a[i];
            i++;
        }
        else{
            b[k++]= a[j];
            j++;
        }
    }
    while(i<=mid)
    {
        b[k++] = a[i++];
    }
    while(j<=high)
    {
        b[k++] = a[j++];
        
    }
    int p= low;
    for(int l = 0;l<k;l++)
    {
        a[p++] = b[l];
    }
    
    
}
void mergesort(int a[],int low,int high)
{
    if(high<=low)
    return ;
    int mid;
    mid= (low + (high-low)/2);
    
    mergesort(a,low,mid);
    mergesort(a,mid+1,high);
    merge(a,low,mid,high);
}
int main()
{
    int a[10] = {10,80,12,63,1,2,45,95,68,11};
    mergesort(a,0,9);
    for(int i=0;i<10;i++)
{    cout<<a[i]<<" ";}
    return 0;
}