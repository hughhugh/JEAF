/*
* Copyright (C) 2010 Grupo Integrado de Ingeniería
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/ 


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.gii.common.eaf.benchmark.real_param;

import es.udc.gii.common.eaf.benchmark.BenchmarkObjectiveFunction;
import java.util.Arrays;

/**
 *
 * @author Grupo Integrado de Ingeniería (<a href="http://www.gii.udc.es">www.gii.udc.es</a>) 
 * @since 1.0
 */
public class LevyObjectiveFunction extends BenchmarkObjectiveFunction {

    @Override
    public double evaluate(double[] values) {

        double fitness = Double.MAX_VALUE;
        double[] x, z;
        double s;

        x = new double[values.length];
        z = new double[values.length];

        //x ~ [-10.0, 10.0]
        for (int i = 0; i < values.length; i++) {
            x[i] = values[i] * 10.0;
            z[i] = 1.0 + ((x[i] - 1.0) / 4.0);
        }

        s = Math.sin(Math.PI * z[0]) * Math.sin(Math.PI * z[0]);

        int i;
        for (i = 0; i < values.length - 1; i++) {
            s += (z[i] - 1.0) * (z[i] - 1.0) * (1.0 + 10.0 * Math.sin(Math.PI * z[i+1]) * Math.sin(Math.PI * z[i+1]));
        }

        fitness = s + (z[i] - 1.0) * (z[i] - 1.0);



        return fitness;

    }

    @Override
    public void reset() {
    }

    @Override
    public double[][] getOptimum(int dim) {

        double[][] optimums = new double[1][];
        double[] optimum = new double[dim];

        Arrays.fill(optimum, 0.1);

        optimums[0] = optimum;
        return optimums;

    }
}
