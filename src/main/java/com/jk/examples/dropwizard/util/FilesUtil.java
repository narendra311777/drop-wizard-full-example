/*
 * Copyright 2002-2016 Jalal Kiswani.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jk.examples.dropwizard.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

/**
 * Utility methods to deal with Files.
 *
 * @author Jalal
 */
public class FilesUtil {

	/**
	 * Read files contents as string using Apache IO library,.
	 *
	 * @param fileName
	 *            the file name
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static String readResourceFile(final String fileName) throws IOException {
		InputStream in = null;
		try {
			in = FilesUtil.class.getResourceAsStream(fileName);
			if (in == null) {
				System.out.print("Resource " + fileName + " is not found");
				return null;
			}
			return IOUtils.toString(in);
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
