import java.util.*;

public class Hashmap {
    public static void main(String[] args){
        String s2= "hola";
        check(s2);
	
    }

    static void check(String s){
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String vocales = "aeiou";
		map.put("vocales", 0);
        map.put("consonantes", 0);
		for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
			if(vocales.contains(c + "")){
                map.put("vocales", map.get("vocales")+1);
			}
            else{
                if(Character.isLetter(c)){
                map.put("consonantes",map.get("consonantes")+1);}
            }
		}
			
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			Object x=itr.next();
			System.out.println("count of "+x+" : "+map.get(x));
		}
	}
}


