import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class PraticandoAssertivas {


    @Test
    public void praticandoAssertTrue(){
        //valida se um valor é verdadeiro
        boolean eMaiorDeIdade = true;
        Assert.assertTrue(eMaiorDeIdade);

    }
    @Test
    public void praticandoAssertFalse(){
        boolean foiReprovado = false;
        Assert.assertFalse(foiReprovado);
    }

    @Test
    public void praticandoAssertNull(){
        Carro carro = null;
        Assert.assertNull(carro);
    }

    @Test
    public void praticandoAssertNotNull(){
        Carro carro = new Carro();
        Assert.assertNotNull(carro);
    }


    /*
    @Test
    public void praticandoAssertArraysEquals(){
        int [] nums1 = new int[]{1,2,3};
        int [] nums2 = new int[]{1,2,3};

        Assert.assertArrayEquals(nums1,nums2);
    }*/

    @Test
    public void praticandoAssertEquals_primitivos() {
    int a = 1;
    int b = 1;

    Assert.assertEquals(a, b);
    }
    }

