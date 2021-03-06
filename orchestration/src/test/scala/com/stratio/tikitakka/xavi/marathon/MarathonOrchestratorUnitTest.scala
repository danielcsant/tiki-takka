/*
 * Copyright (C) 2015 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.tikitakka.xavi.marathon

import akka.actor.ActorSystem
import akka.stream.{ActorMaterializer, ActorMaterializerSettings}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{ShouldMatchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class MarathonOrchestratorUnitTest extends WordSpec with ShouldMatchers {

  trait ActorTestSystem {
    implicit val system = ActorSystem("Actor-Test-System")
    implicit val actorMaterializer = ActorMaterializer(ActorMaterializerSettings(system))
  }

  "Marathon Orchestrator" should {
    "recover the uri correctly" in new MarathonOrchestrator with ActorTestSystem {
      uri shouldBe "http://localhost:8080"
    }
  }
}
