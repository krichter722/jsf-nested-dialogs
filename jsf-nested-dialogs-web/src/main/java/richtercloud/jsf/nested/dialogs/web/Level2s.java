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
package richtercloud.jsf.nested.dialogs.web;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;
import richtercloud.jsf.nested.dialogs.jar.Level2;

/**
 *
 * @author richter
 */
@ManagedBean
@SessionScoped
public class Level2s {
    private Level2 edit;

    /**
     * Creates a new instance of Level2s
     */
    public Level2s() {
    }

    public void createNew() {
        this.edit = new Level2();
    }

    public Level2 getEdit() {
        return edit;
    }

    public void setEdit(Level2 edit) {
        this.edit = edit;
    }

    public void openLevel2() {
        createNew();
        Map<String,Object> options = new HashMap<>();
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("level2dialog", options, null);
    }

    public void save() {
        throw new UnsupportedOperationException();
    }
}
