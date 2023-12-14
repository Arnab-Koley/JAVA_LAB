public class wrapper {
    public static void main(String args[]) {

        int a = 10;
        float b = 3.45f;
        char c = 'd';
        double d = 5.55;

        Integer i = a;
        Float f = b;
        Character ch = c;
        Double db = d;

        System.out.println("Primitive Integer : "+a+" ==> Wrapper Integer Object : "+i);
        System.out.println("Primitive Float : "+b+" ==> Wrapper Float Object : "+f);
        System.out.println("Primitive Character : "+c+" ==> Wrapper Character Object : "+ch);
        System.out.println("Primitive Double : "+d+" ==> Wrapper Double Object : "+db);

        // int i1 = null;   ==> error: incompatible types: <null> cannot be converted to int
        // float f1 = null; ==> error: incompatible types: <null> cannot be converted to float

        Integer i1 = null;
        Float f1 = null;
        System.out.println("\nInteger : "+i1+"\nFloat : "+f1);

        Integer i2 = Integer.valueOf(20);
        Float f2 = Float.valueOf(2.22f);
        Character ch2 = Character.valueOf('c');
        Double db2 = Double.valueOf(3.34);

        int a2 = i2;
        float b2 = f2;
        char c2 = ch2;
        double d2 = db2;

        System.out.println("\nWrapper Integer Object : "+i2+" ==> Primitive Integer : "+a2);
        System.out.println("Wrapper Float Object : "+f2+" ==> Primitive Float : "+b2);
        System.out.println("Wrapper Character Object : "+ch2+" ==> Primitive Character : "+c2);
        System.out.println("Wrapper Double Object : "+db2+" ==> Primitive Double : "+d2);



        char[] arr = {'a','B',' ','1'};
        System.out.println("\nCharacter Array Elements: ");
        for(int j=0;j<arr.length;j++){
            if(arr[j] >= 'A' && arr[j] <= 'Z'){
                System.out.println(arr[j]+" : Uppercase");
            }
            else if(arr[j] >= 'a' && arr[j] <= 'z'){
                System.out.println(arr[j]+" : Lowercase");
            }
            else if (arr[j] >= '0' && arr[j] <= '9'){
                System.out.println(arr[j]+" : Digit");
            }
            else if (arr[j] == ' '){
                System.out.println(arr[j]+" : Whitespace");
            }
            else{
                System.out.println(arr[j]+" : Special character");
            }
        }
    }
}
