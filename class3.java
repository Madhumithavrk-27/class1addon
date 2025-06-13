class Main {
    public static void main(String[] args) {
        String name="manaksa";
         System.out.println(name.toUpperCase());
        System.out.println(name);
        
    }
}

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        name.append("manaksa");
        System.out.println(name.reverse());
        System.out.println(name);
    }
}

task

class Main {
    public static void main(String[] args) {
        String name = "manaksa";
        int n= name.length();
        for(int i=0;i<n;i++){
            System.out.println(name.charAt(i));
        }
        
       // System.out.println(name.charAt(0));
        
        
        
       // System.out.println(name);
    }
}

task
to count the vowels
class Main {
    public static void main(String[] args) {
        String name = "encyclopedia";
        int n= name.length();
        int count= 0; 
        for(int i=0;i<n;i++){
            System.out.println(name.charAt(i));
            if(name.charAt(i)=='a')
                count++;
                if(name.charAt(i)=='i')
                count++;
                if(name.charAt(i)=='e')
                count++;
                if(name.charAt(i)=='o')
                count++;
                if(name.charAt(i)=='u')
                count++;
        }
        System.out.println(count);
        
       // System.out.println(name.charAt(0));
        
        
        
       // System.out.println(name);
    }
}

TO COUNT VOWELS AND CONSONANTS
METHOD 1

class Main {
    public static void main(String[] args) {
        String name = "encyclopedia";
        int n =name.length();
        int count1=0;
        int count2=0;
         for(int i=0;i<n;i++)
         {
                System.out.println(name.charAt(i));
                 if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o' ||name.charAt(i)=='u' ){
                     count1++;
                 }
                  if(name.charAt(i)!='a' && name.charAt(i)!='e'&& name.charAt(i)!='i'&& name.charAt(i)!='o'&& name.charAt(i)!='u' )
                 {
                    count2++;
                 }
         }
         System.out.println("vowels counts:" + count1);
          System.out.println("con counts:" + count2);
               
               
    }
}

METHOD 2


class Main {
    public static void main(String[] args) {
        String name = "manut";
        int n= name.length();
        int count= 0;
        int count1=0;
        for(int i=0;i<n;i++){
            System.out.println(name.charAt(i));
            if(name.charAt(i)=='a' || name.charAt(i)=='i' || name.charAt(i)=='e' || name.charAt(i)=='o' || name.charAt(i)=='u')
                count++;
       
           else if(name.charAt(i)>='a'&& name.charAt(i)<='z') {
               count1++;
           
               
           }
               
        }
       
        System.out.println(count);
        System.out.println(count1);
        
               
               
                }
}
               
       // System.out.println(name.charAt(0));
       
       
       
       // System.out.println(name);

   



