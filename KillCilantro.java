public class KillCilantro {
public static void main(String[] args) {
System.out.println(killCilantro("aa cilantro cilantra o"));

}

public static String killCilantro(String input) {
String tempvalue = input.substring(input.indexOf("cilantro"));
String tempoutput = input.substring(0, input.indexOf("cilantro"));

   while (tempvalue.indexOf("cilantro") != -1) {
   tempoutput = tempoutput + tempvalue.substring(0, input.indexOf("cilantro"));
   tempvalue = tempvalue.substring(input.indexOf("c"));
   
      if ((tempvalue.indexOf("c") == 0) && (tempvalue.indexOf("i") == 1) && (tempvalue.indexOf("l") == 2) && (tempvalue.indexOf("a") == 3) && (tempvalue.indexOf("n") == 4) && (tempvalue.indexOf("t") == 5) && (tempvalue.indexOf("r") == 6) && (tempvalue.indexOf("o") == 7)) {
      tempvalue = tempvalue.substring(input.indexOf("o"));
      tempoutput = tempoutput + "parsley" + tempvalue.substring(0, input.indexOf("c"));
      }
      else {
      tempoutput = tempoutput + tempvalue.substring(0, input.indexOf("c"));
      }
   }
return tempoutput;
}
}