package org.apache.maven.surefire.its.jiras;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.surefire.its.fixture.SurefireJUnit4IntegrationTestCase;
import org.junit.Test;

/**
 * @author  <a href="mailto:anders_wallgren@alum.mit.edu">Anders Wallgren</a>
 * @see     <a href="https://issues.apache.org/jira/browse/SUREFIRE-1759">SUREFIRE-1759</a>
 */
public class Surefire1759IT
    extends SurefireJUnit4IntegrationTestCase
{

    @Test public void runOrderAlphabetical()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "alphabetical" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }

    @Test public void runOrderFilesystem()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "filesystem" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }

    @Test public void runOrderHourly()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "hourly" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }

    @Test public void runOrderRandom()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "random" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }

    @Test public void runOrderReversealphabetical()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "reversealphabetical" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }

    @Test public void runOrderBalanced()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "balanced" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }

    @Test public void runOrderFailedfirst()
    {
        unpack( "surefire-1759" )
                .sysProp( "surefire.runOrder", "failedfirst" )
                .executeInstall()
                .verifyErrorFree( 1 )
                .verifyTextInLog( "Tests run: 1, Failures: 0, Errors: 0, Skipped: 0" );
    }
}
