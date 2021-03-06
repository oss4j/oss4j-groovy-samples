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
package org.oss4j.samples.groovy.mix.java.greeter.client;

import org.oss4j.samples.groovy.mix.groovy.greeter.impl.GroovyGreeterImpl;
import org.oss4j.samples.groovy.mix.java.greeter.api.JavaGreeter;

/**
 * The Java client
 * 
 * @author Krzysztof Sobkowiak
 */
public class JavaGreeterClient {

    /**
     * The program entry method
     * 
     * @param args the program arguments
     */
    public static void main(String[] args) {
        JavaGreeter greeter = new GroovyGreeterImpl();
        greeter.sayHello();
    }

}
