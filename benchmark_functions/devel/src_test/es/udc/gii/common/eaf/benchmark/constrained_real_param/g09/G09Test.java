/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g09;

/**
 *
 * @author pilar
 */
public class G09Test {

    /**
     * xi ~ [-10, 10]
     * @param values
     */
    public static void normalize(double[] values) {

        for (int i = 0; i<values.length; i++) {
            values[i] = values[i]/10.0;
        }

    }

}
