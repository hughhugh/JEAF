/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g19;

import es.udc.gii.common.eaf.benchmark.constrained_real_param.CEC2006Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pilar
 */
public class G19ConstraintFunction_g5Test {

    public G19ConstraintFunction_g5Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of evaluate method, of class G19ConstraintFunction_g5.
     */
    @Test
    public void testEvaluate() {
        System.out.println("evaluate");
        double[] values = CEC2006Test.loadBestKnownSolution(19);
        G19Test.normalize(values);
        G19ConstraintFunction_g5 instance = new G19ConstraintFunction_g5();
        double expResult = 0.0;
        double result = instance.evaluate(values);
        boolean cond = (result <= expResult);
        assertTrue(cond);
    }

}