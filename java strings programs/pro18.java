class pro18
{
    public static void main(String[] args) {
        String s = "Suyra123@";
        String s2 = s.toUpperCase();
        char[] ch = s.toCharArray();
        char[] ch2 = s2.toCharArray();
        int uppercaseCount=0;
        int lowercaseCount=0;
        int vowelscount=0;
        int consonantscount=0;
        int digitscount=0;
        int splcharcount=0;
        for(int i =0;i<ch.length;i++)
        {
            if(ch[i]>='A'  && ch[i]<='Z')
            {
                uppercaseCount++;
            }
            if(ch[i]>='a'  && ch[i]<='z')
            {
                lowercaseCount++;
            }

           if(ch2[i]>='A' && ch2[i]<='Z')
            {
                if(ch2[i]=='A' || ch2[i]=='E'|| ch2[i]=='I'|| ch2[i]=='O'|| ch2[i]=='U')
                {
                      vowelscount++;
                }
                else
                      consonantscount++;
            }
            else if(ch[i]>='0' && ch[i]<='9')
            {
                digitscount++;
            }
            else
            {
                if(ch[i]!=' ')
                {
                     splcharcount++;
                }
            }
            
        }
        double totlength = ch.length;
        double uppercasePercent=uppercaseCount/totlength*100;
        double lowercasePercent=(lowercaseCount/totlength)*100f;
        double vowelsPercent=(vowelscount/totlength)*100;
        double consonantPercent=(consonantscount/totlength)*100;
        double digitsPercent=(digitscount/totlength)*100;
        double splcharPercent=(splcharcount/totlength)*100;
        System.out.println("Uppercase count percentage is : "+uppercasePercent);
        System.out.println("Lowercase count percentage is : "+lowercasePercent);
        System.out.println("digits count percentage is : "+digitsPercent);
        System.out.println("special charachters count percentage is : "+splcharPercent);
        System.out.println("vowels count percentage is : "+vowelsPercent);
        System.out.println("consonants count percentage is : "+consonantPercent);  
        
    }
}