import java.util.HashMap;
import java.util.Map;
class demo
{
    public static void main(String[] args) 
    {
        HashMap<String,Boolean> x = new HashMap<>();
        x.put("hari",false);
         x.put("surya",false);
        x.put("nadh",true);
       // System.out.println(x.get("surya"));
        for(Map.Entry<String,Boolean> entry:x.entrySet())
        {
            System.out.println(entry.getKey());
        }
    }
}