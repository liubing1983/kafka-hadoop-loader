/*
 * Copyright 2014 Michal Harish, michal.harish@gmail.com
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.amient.kafka.hadoop.writable;

public class MessageSourceWritableBuilder {

    private String brokerHost;
    private String topic;
    private Integer brokerId;
    private Integer partition;
    private Long offset;

    public MessageSourceWritableBuilder() {
        resetBuilder();
    }

    public MessageSourceWritableBuilder setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public MessageSourceWritableBuilder setBrokerHost(String brokerHost) {
        this.brokerHost = brokerHost;
        return this;
    }

    public MessageSourceWritableBuilder setBrokerId(int brokerId) {
        this.brokerId = Integer.valueOf(brokerId);
        return this;
    }

    public MessageSourceWritableBuilder setPartition(int partition) {
        this.partition = Integer.valueOf(partition);
        return this;
    }

    public MessageSourceWritableBuilder setOffset(long offset) {
        this.offset = Long.valueOf(offset);
        return this;
    }

    public void resetBuilder() {
        brokerHost = "";
        topic = null;
        brokerId = null;
        partition = null;
        offset = null;
    }

    public MessageSourceWritable createMessageSourceWritable() {
        return new MessageSourceWritable(topic, brokerId, brokerHost, partition, offset);
    }
}