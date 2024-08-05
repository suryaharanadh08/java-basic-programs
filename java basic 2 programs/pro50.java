class pro50
{
    public static void main(String[] args) {
        System.out.println("\n");
        for(int i=5;i>=1;i--)
        {
            for(int k=i;k<5;k++)
            {
                System.out.print(" ");

            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");
                
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
                System.out.println("");
            
        }

        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");
                
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
                System.out.println("");
            
        }
        System.out.println("\n\n");
    
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
           {
                System.out.print("*");
           }
           
           System.out.println("");
        }

        
        System.out.println("\n");

        for(int i=5;i>=1;i--)
        {
            for(int k=i;k<5;k++)
            {
                System.out.print(" ");

            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }
        
        System.out.println("\n");
        

        for(int i =1;i<=5;i++)
        { 
           
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
               
            }
            System.out.println("");
            
        }
        System.out.println("\n");

        int c=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
        System.out.println("\n");


        for(int i=5;i>=1;i--)
        {
            int r=5;
            for(int j=i;j<=5;j++)
            {
                System.out.print(r+" ");
                r--;
            }
            System.out.println("");
        }


        System.out.println("\n");

        int y;
        for(int i=1;i<=5;i++)
        {
            y=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(y +" ");
                y--;
            }
            System.out.println("");
        }
        System.out.println("\n");

        
        
        for(int i=1;i<=5;i++)
        {
            int z=1;
            for(int j=1;j<=i;j++)
            {
                if(z==1)
                {
                    System.out.print("1");
                    z=0;                    
                }
                
                else
                {
                    System.out.print("0");
                    z=1;                    
                }
            }
            System.out.println("");
        }
        System.out.println("\n");

        
        
        for(int i=1;i<=4;i++)
        {
            int z=2;
            for(int j=i;j<4;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int k=z;k<=i;k++)
            {
                System.out.print(k);
            }
            z++;
            System.out.println("");
        }   
        
        System.out.println("\n");
        
        
        for(int i =1;i<=7;i++)
        { 
           
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(j);
                if(j<i)
                {
                    System.out.print("*");
                }
               
            }
            System.out.println("");
            
        }
        System.out.println("\n");


        
        for(char o='A';o<='F';o++)
        {
            for(char x='A';x<=o;x++)
            {
                System.out.print(x+" ");

            }
            System.out.println("");
        }
         System.out.println("\n");
        
        
        
        for(char o='G';o>='A';o--)
        {
            for(char x='A';x<=o;x++)
            {
                System.out.print(x+" ");

            }
            System.out.println("");
        }
         System.out.println("\n");
        
        
        
        
         for(int i =1;i<=7;i++)
        { 
           
            for(int j=1;j<=2*i-1;j++)
            {
                
                if(i==j)
                {
                    System.out.print(j);
                }
                
                else
                {
                    System.out.print("*");
                }
               
            }
            System.out.println("");
            
        }
        System.out.println("\n");
        
        for(int i=1;i<8;i++)
        {
            int t=1;
            int d=i;
            int set=1;
            for(int j=7;j>=1;j--)
            {
                if(d==j)
                {
                    System.out.print(t);
                    t++;
                    set=0;
                }
                else{
                    if(set==0)
                    {
                        System.out.print(t);
                        t++;
                    }
                    else
                    {
                        System.out.print("*");
                    }
                    
                }
            }
            System.out.println("");
        }
        System.out.print("\n");
        
        
        
        for(int i=1,l=5;i<=4;i++,l--)
        {
            for(int k=l;k<5;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=i;j<=4;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
            
        }
        for(int i=4,l=1;i>=1;i--,l++)
        {
            for(int k=l;k<4;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=i;j<=4;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("\n");
        
        
        
        
        
        
        
        
        for(int i=4;i>=1;i--)
        {
            int z=2;
            for(int j=i;j<4;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int k=z;k<=i;k++)
            {
                System.out.print(k);
            }
            z++;
            System.out.println("");
        }   
            
    }

}