/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.cas.server.session;

import org.jasig.cas.server.login.TokenServiceAccessRequest;

/**
 * Abstract implementation to handle the methods that don't matter for invalid requests.
 *
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 4.0.0
 */
public abstract class AbstractInvalidAccess implements Access {

    public final String getId() {
        return null;
    }

    public final Session getSession() {
        return null;
    }

    public final String getResourceIdentifier() {
        return null;
    }

    public final void validate(final TokenServiceAccessRequest tokenServiceAccessRequest) {
        throw new UnsupportedOperationException();
    }

    public final boolean invalidate() {
        return false;
    }

    public final boolean isLocalSessionDestroyed() {
        return false;
    }

    public final boolean requiresStorage() {
        return false;
    }

    public final boolean isUsed() {
        return false;
    }
}