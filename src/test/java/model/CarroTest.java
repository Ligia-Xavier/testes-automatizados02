package model;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    //JUnit 4:
    // @Before @BeforeClass @After @AfterClass
    //JUnit 5:
    //@BeforeEach @BeforeAll @AfterEach @AfterAll

    @Test
    public void deveIniciarDesligado(){
        Carro carro = new Carro();
        Assert.assertTrue(carro.getLigado() == false);
    }

    @Test
    public void deveIniciarComVelocidadeZero(){
        Carro carro = new Carro();
        Assert.assertTrue(carro.getVelocidadeAtual()==0);
    }

    @Test
    public void deveLigarCorretamente(){
        Carro carro = new Carro();
        carro.ligar();
        Assert.assertTrue((carro.getLigado()));
    }

    @Test
    public void deveDesligarCorretamente(){
       Carro carro = new Carro();
       carro.ligar();
       carro.desligar();
       Assert.assertFalse("Mensagem que só aparece qdo teste falha", carro.getLigado());
    }


    @Test
    public void deveAcelerarCorretamente(){
        Carro carro = new Carro();
        carro.acelerar(10);

        Assert.assertEquals((Integer)10,carro.getVelocidadeAtual());
    }

    @Test
    public void naoPodeUltrapassarVelocidadeMaxima(){
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(150);
        carro.acelerar(100);
        Assert.assertEquals((Integer) 200, carro.getVelocidadeAtual());
    }

    @Test
public void velocidadeNaoPodeSerMenorQueZero(){

        //Given
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(15);

        //When

        carro.frear(20);

        //Then
        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());

}
}
