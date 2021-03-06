/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.xd.dirt.modules.metadata;

import org.springframework.xd.module.options.spi.ModuleOption;

/**
 * Describes options to the {@code time} source module.
 * 
 * @author Eric Bottard
 */
public class TimeSourceOptionsMetadata {

	private String format = "yyyy-MM-dd HH:mm:ss";

	private int fixedDelay = 1;


	public String getFormat() {
		return format;
	}

	@ModuleOption("how to render the current time, using SimpleDateFormat")
	public void setFormat(String format) {
		this.format = format;
	}


	public int getFixedDelay() {
		return fixedDelay;
	}


	@ModuleOption("how often to emit a message, expressed in seconds")
	public void setFixedDelay(int fixedDelay) {
		this.fixedDelay = fixedDelay;
	}


}
