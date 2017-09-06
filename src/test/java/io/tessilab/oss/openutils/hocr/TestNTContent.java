/*
 * Copyright 2017 Tessi lab.
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
package io.tessilab.oss.openutils.hocr;

import io.tessilab.oss.openutils.hocr.ContentType;
import io.tessilab.oss.openutils.hocr.NTContent;
import static org.junit.Assert.assertEquals;

import java.awt.Rectangle;

import org.junit.Test;

public class TestNTContent {

    @Test
    public void testGetters() {
        ContentType type = ContentType.FRAME;
        Rectangle r = new Rectangle(0, 4, 30, 45);
        NTContent nt = new NTContent(type, r);
        assertEquals(type, nt.getType());
        assertEquals(r, nt.getBBox());
    }

}
