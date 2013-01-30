/*****************************************************************************
 * Copyright (c) 2013, theborakompanioni (http://www.example.org)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ****************************************************************************/
package at.pollux.thymeleaf.shiro.processor.attribute;

import org.thymeleaf.processor.IProcessor;

import at.pollux.thymeleaf.shiro.processor.InvertVisibilityAttrProcessor;

public class LacksRoleAttrProcessor extends InvertVisibilityAttrProcessor<HasRoleAttrProcessor> {

    private static final String ATTRIBUTE_NAME = "lacksRole";

    public static IProcessor create() {
        return new LacksRoleAttrProcessor();
    }

    protected LacksRoleAttrProcessor() {
        super(ATTRIBUTE_NAME, HasRoleAttrProcessor.create());
    }
}