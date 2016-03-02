/*
 * Copyright 2012-2013 the original author or authors.
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

package cz.deii.sandbox.amqp;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class EchoService {

	@RabbitListener(bindings = @QueueBinding(
			value = @Queue(value = "echo_service_v1.hello", durable = "false", autoDelete = "true"),
			exchange = @Exchange(value = "echo_service_v1", durable = "false", autoDelete = "true"),
			key = "hello"))
	public String hello(String in) {
		return "Hello " + in + "!";
	}

	@RabbitListener(bindings = @QueueBinding(
			value = @Queue(value = "echo_service_v1.salut", durable = "false", autoDelete = "true"),
			exchange = @Exchange(value = "echo_service_v1", durable = "false", autoDelete = "true"),
			key = "salut"))
	public String salut(String in) {
		return "Salut " + in + "!";
	}

	@RabbitListener(bindings = @QueueBinding(
			value = @Queue(value = "echo_service_v1.ciao", durable = "false", autoDelete = "true"),
			exchange = @Exchange(value = "echo_service_v1", durable = "false", autoDelete = "true"),
			key = "ciao"))
	public String ciao(String in) {
		return "Ciao " + in + "!";
	}

	@RabbitListener(bindings = @QueueBinding(
			value = @Queue(value = "echo_service_v1.ola", durable = "false", autoDelete = "true"),
			exchange = @Exchange(value = "echo_service_v1", durable = "false", autoDelete = "true"),
			key = "ola"))
	public String ola(String in) {
		return "Ola " + in + "!";
	}

	@RabbitListener(bindings = @QueueBinding(
			value = @Queue(value = "echo_service_v1.ahoj", durable = "false", autoDelete = "true"),
			exchange = @Exchange(value = "echo_service_v1", durable = "false", autoDelete = "true"),
			key = "ahoj"))
	public String ahoj(String in) {
		return "Ahoj " + in + "!";
	}

}
