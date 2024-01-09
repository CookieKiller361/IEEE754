public class IEEE {
    public static String fromFloatToIEEE(float eingabe) {
        //*von Ihnen zu befüllen*
        //0/01111111/00000000000000000000000
        StringBuilder output = new StringBuilder();
        String eingabeAsString = String.valueOf(eingabe);
        int ganzzahligerAnteil = (int) eingabe;
        //todo hier noch die umwandlung von float in binary machen bzw. die umwandlung der einzelnen teile der Floatzahl

//add the Sign bit to the String
        String addable = eingabeAsString.startsWith("0") ? "0/" : "1/";
        output.append(addable);

        return output.toString();
    }

    public String intToBinary(int number) {
        StringBuilder output = new StringBuilder();
        while (number > 0) {
            int restwert = number % 2;
            output.append(restwert >= 1 ? "1" : "0");
            number = number / 2;
        }
        return output.reverse().toString();
    }

    public String intToBinary(float number) {
        StringBuilder output = new StringBuilder();
        //todo insert here the converting things for numbers under 0
        //bei zahlen kleiner null muss man anstatt /2, *2 machen 
        return output.reverse().toString();
    }

    public static void main(String[] args) {

    }
}

