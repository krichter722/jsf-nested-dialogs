/**
 * Copyright 2017 Karl-Philipp Richter
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
 */
package richtercloud.jsf.nested.dialogs.ejb;

import javax.ejb.Stateless;
import richtercloud.jsf.nested.dialogs.jar.beans.SomeBean;

/**
 *
 * @author richter
 */
@Stateless
public class SomeBeanImpl implements SomeBean {
    private static final long serialVersionUID = 1L;

    @Override
    public void doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
