/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g13;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pilar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    G13ConstraintFunction_h1Test.class,
    G13ConstraintFunction_h2Test.class,
    G13ConstraintFunction_h3Test.class,
    G13ObjectiveFunctionTest.class
})
public class G13Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

}