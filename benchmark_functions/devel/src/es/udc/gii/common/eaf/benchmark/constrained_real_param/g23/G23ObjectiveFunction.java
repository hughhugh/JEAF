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
 * G02ObjectiveFunction.java
 *
 * Created on 28 de agosto de 2007, 11:10
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g23;

import es.udc.gii.common.eaf.problem.objective.ObjectiveFunction;
import java.util.List;

/**
 *
 * @author Grupo Integrado de Ingeniería (<a href="http://www.gii.udc.es">www.gii.udc.es</a>) 
 * @since 1.0
 */
public class G23ObjectiveFunction extends ObjectiveFunction {
    
    /** Creates a new instance of G02ObjectiveFunction */
    public G23ObjectiveFunction() {
    }
    
    public void reset() {
    }
    
    @Override
    public double evaluate(double[] values) {
        
        double fitness = Double.MAX_VALUE;
        double x1, x2, x5, x6, x7, x8;
        
        x1 = (values[0] + 1.0)*300.0;
        x2 = (values[1] + 1.0)*300.0;
        x6 = (values[5] + 1.0)*300.0;
        
        x5 = (values[4] + 1.0)*100.0;
        x7 = (values[6] + 1.0)*100.0;
                
        x8 = (values[7] + 1.0)*200.0;
        
        fitness = -9.0 * x5 - 15.0 * x8 + 6.0 * x1 + 16.0 * x2 +
               10.0 * (x6 + x7);
        return fitness;
        
    }
    
}
