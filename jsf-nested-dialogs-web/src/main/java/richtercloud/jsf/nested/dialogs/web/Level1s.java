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
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import richtercloud.jsf.nested.dialogs.jar.Level1;

/**
 *
 * @author richter
 */
@ManagedBean
@SessionScoped
public class Level1s {
    private Level1 edit;

    /**
     * Creates a new instance of Level1s
     */
    public Level1s() {
    }

    public void createNew() {
        System.out.println(String.format("%s: createNew invoked", getClass().getSimpleName()));
        this.edit = new Level1();
    }

    public Level1 getEdit() {
        return edit;
    }

    public void setEdit(Level1 edit) {
        this.edit = edit;
    }

    public void onAction(ActionEvent event) {
        createNew();
    }

    public void openLevel1() {
        createNew();
        Map<String,Object> options = new HashMap<>();
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("level1dialog.xhtml", options, null);
    }

    public void save() {
        throw new UnsupportedOperationException();
    }
}
