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
package org.oss4j.samples.groovy.mix.gmaven.groovy.greeter.client

import org.oss4j.samples.groovy.mix.gmaven.groovy.greeter.api.GroovyGreeter
import org.oss4j.samples.groovy.mix.gmaven.java.greeter.impl.JavaGreeterImpl


/**
 * The Groovy client
 *
 * @author Krzysztof Sobkowiak
 */
class GroovyGreeterClient {

    /**
     * The program entry method
     *
     * @param args the program arguments
     */
    static main(args) {
        GroovyGreeter greeter = new JavaGreeterImpl()
        greeter.sayHello()
    }
}
