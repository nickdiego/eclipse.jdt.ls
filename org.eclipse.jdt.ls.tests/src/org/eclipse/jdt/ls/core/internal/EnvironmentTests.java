/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.ls.core.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 *
 */
public class EnvironmentTests {

	@Test
	public void testEnvironmentVars(){
		assertNull(Environment.getEnvironment(null));
	}

	@Test
	public void testProperty(){
		assertNull(Environment.getProperty(null));
		assertNull(Environment.getProperty("madeup.property"));
		assertNotNull(Environment.getProperty("os.name"));
	}

	@Test
	public void testAll(){
		assertNull(Environment.get(null));
		assertNull(Environment.get("madeup.property"));
		assertNotNull(Environment.get("os.name"));
		assertEquals("defaultValue", Environment.get("madeup.property", "defaultValue"));
	}

}
