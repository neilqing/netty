/*
 * Copyright 2019 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel.epoll;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.socket.InternetProtocolFamily;
import io.netty.testsuite.transport.TestsuitePermutation;
import io.netty.testsuite.transport.socket.DatagramMulticastTest;

import java.util.List;

public class EpollDatagramMulticastTest extends DatagramMulticastTest {
    @Override
    protected List<TestsuitePermutation.BootstrapComboFactory<Bootstrap, Bootstrap>> newFactories() {
        return EpollSocketTestPermutation.INSTANCE.datagram(internetProtocolFamily());
    }
}
