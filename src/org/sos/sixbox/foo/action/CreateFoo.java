package org.sos.sixbox.foo.action;

import org.sos.sixbox.foo.service.FooService;
import org.sos.sixbox.utils.action.ActionVariableSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Lodour on 17/7/4 10:43.
 * 创建Foo的动作
 */
@Controller
public class CreateFoo extends ActionVariableSupport {
    private final FooService fooService;

    @Autowired
    public CreateFoo(FooService fooService) {
        this.fooService = fooService;
    }

    public String execute() {
        String bar = httpServletRequest.getParameter("bar");
        if ("".equals(bar))
            return ERROR;
        fooService.create(bar);
        return SUCCESS;
    }
}
