/*
 * Copyright 2011-2014 the original author or authors.
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

package org.springframework.xd.integration.test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.springframework.xd.integration.util.Sink;
import org.springframework.xd.integration.util.Source;

/**
 * @author Glenn Renfro
 */
@RunWith(Parameterized.class)
public class HttpTest extends AbstractIntegrationTest {

	public HttpTest(Sink sink) {
		this.sink = sink;
	}

	@Test
	public void testHttp() throws Exception {
		String data = UUID.randomUUID().toString();
		stream(Source.HTTP + XD_DELIMETER + sink);
		send("HTTP", data);

		assertReceived();
		assertValid(data);
	}

}
