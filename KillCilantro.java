public class KillCilantro {
public static void main(String[] args) {
System.out.println(killCilantro("aa cilantro cilantra o"));

}

public static String killCilantro(String input) {
String tempvalue = input.substring(input.indexOf("cilantro"));
String tempoutput = input.substring(0, input.indexOf("cilantro"));
   while (tempvalue.indexOf("cilantro") != -1) {
   if (tempvalue.indexOf("cilantro") == 0) {
   tempvalue = tempvalue.substring(8);
   if (tempvalue.indexOf("cilantro") != -1) {
   tempoutput = tempoutput + "parsley" + tempvalue.substring(0, tempvalue.indexOf("cilantro"));
   }
   else {
   tempoutput = tempoutput + "parsley" + tempvalue;
   }
   }
   else if (tempvalue.indexOf("cilantro") != -1) {
   tempoutput = tempoutput + tempvalue.substring(0, tempvalue.indexOf("cilantro"));
   tempvalue = tempvalue.substring(tempvalue.indexOf("cilantro"));
   }
}
return tempoutput;
}
}
