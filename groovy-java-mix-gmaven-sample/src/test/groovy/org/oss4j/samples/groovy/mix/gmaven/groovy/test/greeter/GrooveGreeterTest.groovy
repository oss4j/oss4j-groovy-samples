/**
 * Copyright (C) 2013-2014 Open Solutions for Java
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
package org.oss4j.samples.groovy.mix.gmaven.groovy.test.greeter;

import org.junit.Test
import org.oss4j.samples.groovy.mix.gmaven.groovy.greeter.api.GroovyGreeter
import org.oss4j.samples.groovy.mix.gmaven.groovy.greeter.impl.GroovyGreeterImpl
import org.oss4j.samples.groovy.mix.gmaven.java.greeter.api.JavaGreeter
import org.oss4j.samples.groovy.mix.gmaven.java.greeter.impl.JavaGreeterImpl

/**
 * Test casses for greeter implementations
 *
 * @author Krzysztof Sobkowiak
 */
class GrooveGreeterTest {

    /**
     * Test case for {@link JavaGreeterImpl}
     */
    @Test
    public void testJavaGreeterImpl() {
        GroovyGreeter greeter = new JavaGreeterImpl();
        greeter.sayHello();
    }

    /**
     * Test case for {@link GroovyGreeterImpl}
     */
    @Test
    public void testGroovyGreeterImpl() {
        JavaGreeter greeter = new GroovyGreeterImpl();
        greeter.sayHello();
    }
}
