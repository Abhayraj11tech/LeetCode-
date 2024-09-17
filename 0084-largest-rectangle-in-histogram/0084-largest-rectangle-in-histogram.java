class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int nsr[]=new int[heights.length];
        int nsl[]=new int[heights.length];
        int res[]=new int[heights.length];
        Stack<Integer> s = new Stack<>();
         Stack<Integer> s1 = new Stack<>();
         int Max=0;

         for(int j=heights.length-1;j>=0;j--)   
        {
            while(!s1.isEmpty() && heights[s1.peek()]>=heights[j])
            {
                s1.pop();
            }
            if(s1.isEmpty())
            {
                nsr[j]=heights.length;
            }
            else 
            {
                nsr[j]=s1.peek();
            }
            s1.push(j);
        }

        for(int i=0;i<heights.length;i++)    
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            {

            
                nsl[i]=s.peek();
            }
            
            s.push(i);
        }
         
        for(int p=0;p<heights.length;p++)
        {
            res[p]=(heights[p] *(nsr[p]-nsl[p]-1));
        }
         for(int m=0;m<heights.length;m++)
        {
           
           Max= Math.max(Max,res[m]);
        }
        return Max;
        
    }
}