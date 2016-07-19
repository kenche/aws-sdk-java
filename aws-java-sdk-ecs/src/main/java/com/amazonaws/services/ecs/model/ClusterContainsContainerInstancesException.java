/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ecs.model;

/**
 * <p>
 * You cannot delete a cluster that has registered container instances. You must
 * first deregister the container instances before you can delete the cluster.
 * For more information, see <a>DeregisterContainerInstance</a>.
 * </p>
 */
public class ClusterContainsContainerInstancesException extends
        com.amazonaws.services.ecs.model.AmazonECSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ClusterContainsContainerInstancesException with the
     * specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ClusterContainsContainerInstancesException(String message) {
        super(message);
    }

}