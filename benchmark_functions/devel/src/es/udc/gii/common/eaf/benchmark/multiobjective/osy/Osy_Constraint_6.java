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
 * Osy_Constraint6.java
 *
 * Created on 18 de diciembre de 2006, 12:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package es.udc.gii.common.eaf.benchmark.multiobjective.osy;

import es.udc.gii.common.eaf.problem.constraint.InequalityConstraint;

/**
 * Osyczka and Kundu, 1995
 * @author Grupo Integrado de Ingeniería (<a href="http://www.gii.udc.es">www.gii.udc.es</a>) 
 * @since 1.0
 */
public class Osy_Constraint_6 extends InequalityConstraint {

    /** Creates a new instance of Osy_Constraint6 */
    public Osy_Constraint_6() {
    }

    @Override
    public double evaluate(double[] values) {
        final double x5 = 2 * values[4] + 3;
        final double x6 = 5 * values[5] + 5;
        return -((x5 - 3) * (x5 - 3) + x6 - 4);
    }

    @Override
    public String toString() {
        return "Osy_Constraint_6";
    }
}
