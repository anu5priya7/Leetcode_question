public class palindrom {
     
  
        public boolean isPalindrome(int x) {
           
           if(x<0){
             return false;
           }
    
           long rev =0;
           long  temp =x;
    
           while(temp != 0){
             int dig =(int) temp % 10;
                 rev =  rev * 10 + dig;
                  temp = temp/10;
           }
    
           return (rev == x);
            
        }
    
    
    }
    
    

