public class String_Builder {
    public static void main(String[] args) {
    StringBuilder name=new StringBuilder("12345678910    ");
    //-------------------------------APPEND----------------------------------
//        String last=" Prasad";
//        for (int i = 0; i <last.length(); i++) {
//            name.append(last.charAt(i));
//        }
//        System.out.println(name);
//-------------------------------REPLACE----------------------------------
//    name.replace(1,3,"EE");
//        System.out.println(name);

//        name.replace(1,2,"EE");
//        System.out.println(name);
//-------------------------------set CHar At----------------------------------
//    name.setCharAt(1,'e');
//        System.out.println(name);
////----------------------------------INSERT-----------------------------------------
//        name.insert(0,'P');
//        System.out.println(name);
//-----------------------------------REVERSE STRING-------------------------------------------------
        int start=0;
        int end=name.length()-1;
        while(start<=end){
            char temp=name.charAt(start);
            name.setCharAt(start,name.charAt(end));
            name.setCharAt(end,temp);
            start++;
            end--;
        }
        System.out.println(name);
    }
}
