public class removeduplicates{
    public static void removefromstr(String str, int idx, StringBuilder newstr, boolean map[]){
    if(idx == str.length()){
     System.out.println(newstr);
     return;
    }
    char ch = str.charAt(idx);
    if(map[ch-'a'] == true){
        removefromstr(str, idx+1, newstr, map);
    }else{
        map[ch - 'a'] = true;
        removefromstr(str, idx+1, newstr.append(ch), map);
    }
    }
public static void main(String[] args){
    String str = "shivskumari";
    removefromstr(str, 0, new StringBuilder(""),new boolean[26]);
}
}