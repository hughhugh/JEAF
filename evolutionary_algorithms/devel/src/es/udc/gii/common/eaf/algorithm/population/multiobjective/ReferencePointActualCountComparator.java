/*
 * Copyright (C) 2013 pilar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.udc.gii.common.eaf.algorithm.population.multiobjective;

import java.util.Comparator;

/**
 *
 * @author pilar
 */
public class ReferencePointActualCountComparator implements Comparator<ReferencePoint> {

    @Override
    public int compare(ReferencePoint t, ReferencePoint t1) {
        
        if (t.getActualCount()> t1.getActualCount()) {
            return -1;
        } else if (t.getActualCount()< t1.getActualCount()) {
            return 1;
        }
        
        return 0;
    }
    
}
