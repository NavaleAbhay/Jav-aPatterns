public class Solidrectangle{
      public static void main(String[] args) {
        
      

//solid rectangle
int n=4;                       //n=no. of rows
int m=5;                       //m=no.of columns
for(int i=1;i<=n;i++)          //outer loop logic for rows
{
   for(int j=1;j<=m;j++)        //inner loop logic for columns
   {
    System.out.print("*");
   }
   System.out.println();
}
      }
}


//O/p=>
//*****
//***** 
//*****
//*****
//*****