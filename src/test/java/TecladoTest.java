import org.junit.Test;

import static org.junit.Assert.*;

public class TecladoTest {



    @Test
    public void deveRetornarAlex() {
        // given
        String esperado = "alex";
        // when
        Teclado teclado = new Teclado();
        String retorno = teclado.decodifica("1#444#22#88");
        // then
        assertEquals(esperado, retorno);
    }

    @Test
    public void deveRetornarHyan() {
        // given
        String esperado = "hyan";
        // when
        Teclado teclado = new Teclado();
        String retorno = teclado.decodifica("33#888#1#55");
        // then
        assertEquals(esperado, retorno);
    }

    @Test
    public void retornaNumero(){
        String esperado = "h";


        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("33");

        assertEquals(esperado, retorno);
    }

    @Test
    public void retornaDouglas(){
        String esperado = "douglas";

        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("2#555#77#3#444#1#6666");

        assertEquals(esperado, retorno);
    }

    @Test
    public void retornaArrayAlex(){
        String esperado = "alex";

        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("1#444#22#88");

        assertEquals(esperado, retorno);
    }

    @Test
    public void verificaLetraA(){
        String esperado = "a";

        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("1#11");

        assertEquals(esperado,retorno);
    }

    @Test
    public void retorna4splits(){
        int esperado = 4;
        Teclado teclado = new Teclado();
        int retorno = teclado.splitando("11#22#33#44");
        assertEquals(esperado,retorno);
    }

    @Test
    public void validaAlfabeto(){
        String esperado = "abcdefghi";
        Teclado teclado = new Teclado();
        String retorno = teclado.alfabeto("1#11#111#2#22#222#3#33#333");
        assertEquals(esperado,retorno);

    }


}