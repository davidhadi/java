class Main {
    public static void main(String[] args){
        StringBuffer stt = new StringBuffer("Object Language");
          System.out.println(stt);

          for(int i=0; i<stt.length(); i++){
              //int p = i + 1 ;
              System.out.print(""+stt.charAt(i)+"  ");
          }
        System.out.println();
          //inserting a string in the middle
        String aString = new String(stt.toString());
           int pos = aString.indexOf(" Language");
           stt.insert(pos," Oriented");
           System.out.println("New Strings : "+stt);

           //Modifying Characters
        stt.setCharAt(6,'-');

           //Appending a string at the end
        stt.append(" Improve security.");
        //stt.append(" Shakil.");
        System.out.println("Append string : "+stt);
    }
}
