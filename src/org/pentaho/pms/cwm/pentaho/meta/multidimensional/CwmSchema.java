/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
*/
package org.pentaho.pms.cwm.pentaho.meta.multidimensional;

/**
 * Schema object instance interface.
 * Schema contains all elements comprising a Multidimensional database.
 *  
 * <p><em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em></p>
 */
public interface CwmSchema extends org.pentaho.pms.cwm.pentaho.meta.core.CwmPackage {
    /**
     * Returns the value of reference dimensionedObject.
     * @return Value of reference dimensionedObject. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObject}
     */
    public java.util.Collection/*<org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimensionedObject>*/ getDimensionedObject();
    /**
     * Returns the value of reference dimension.
     * @return Value of reference dimension. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension}
     */
    public java.util.Collection/*<org.pentaho.pms.cwm.pentaho.meta.multidimensional.CwmDimension>*/ getDimension();
}