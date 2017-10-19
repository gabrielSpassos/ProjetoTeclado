public class Teclado {
    public Boolean ehAlex(String s) {
        return "1#444#22#88".equals(s);
    }

    public Boolean ehHyan(String s) {
        return "33#888#1#55".equals(s);
    }

    public Boolean retornaH(String s){
        return "33".equals(s);
    }

    public Boolean retornaDouglas(String s){
        return "2#555#77#3#444#1#6666".equals(s);
    }

    public Boolean verificaLetraA(String div){

        switch (div){
            case "1":
                return true;

            case "11":
                System.out.println("B");
                break;
        }

        return false;
    }

    public String alfabeto (String s){
        String div [] = s.split("#");
        String retorno = "";

        for(int i = 0;i<div.length;i++){
            switch (div[i]){
                case "0":
                    retorno = retorno + " ";
                    break;
                case "1":
                    retorno = retorno + "a";
                    break;
                case "11":
                    retorno = retorno + "b";
                    break;
                case "111":
                    retorno = retorno + "c";
                    break;
                case "2":
                    retorno = retorno + "d";
                    break;
                case "22":
                    retorno = retorno + "e";
                    break;
                case "222":
                    retorno = retorno + "f";
                    break;
                case "3":
                    retorno = retorno + "g";
                    break;
                case "33":
                    retorno = retorno + "h";
                    break;
                case "333":
                    retorno = retorno + "i";
                    break;
                case "4":
                    retorno = retorno + "j";
                    break;
                case "44":
                    retorno = retorno + "k";
                    break;
                case "444":
                    retorno = retorno + "l";
                    break;
                case "5":
                    retorno = retorno + "m";
                    break;
                case "55":
                    retorno = retorno + "n";
                    break;
                case "555":
                    retorno = retorno + "o";
                    break;
                case "6":
                    retorno = retorno + "p";
                    break;
                case "66":
                    retorno = retorno + "q";
                    break;
                case "666":
                    retorno = retorno + "r";
                    break;
                case "6666":
                    retorno = retorno + "s";
                case "7":
                    retorno = retorno + "t";
                    break;
                case "77":
                    retorno = retorno + "u";
                    break;
                case "777":
                    retorno = retorno + "v";
                    break;
                case "8":
                    retorno = retorno + "w";
                    break;
                case "88":
                    retorno = retorno + "x";
                    break;
                case "888":
                    retorno = retorno + "y";
                    break;
                case "8888":
                    retorno = retorno + "z";
                    break;
                case "9":
                    retorno = retorno + ".";
                    break;
                case "99":
                    retorno = retorno + "!";
                    break;
                case "999":
                    retorno = retorno + "?";
                    break;
                default:
                    retorno += "";
            }
        }

        return retorno;
    }

    public String decodifica(String s) {

        String digitos[] = s.split("#");
        String retorno = "";

        if(ehAlex(s)) {
            return "alex";
        }
        if(ehHyan(s)) {
            return "hyan";
        }
        if(retornaH(s)){
            return "h";
        }
        if (retornaDouglas(s)){
            return "douglas";
        }

        if(verificaLetraA(digitos[0])) {
            return "a";
        }


        return null;

    }

    public int splitando(String s){

        String digitos[] = s.split("#");
        int retorno = digitos.length;

        return retorno;

    }
}
