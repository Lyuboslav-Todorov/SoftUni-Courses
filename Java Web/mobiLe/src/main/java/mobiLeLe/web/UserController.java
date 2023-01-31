package mobiLeLe.web;

import mobiLeLe.domain.dtos.banding.UserRegisterFormDto;
import mobiLeLe.domain.dtos.view.RoleViewDto;
import mobiLeLe.services.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController {
    private final RoleService roleService;

    @Autowired
    public UserController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView modelAndView) {
        List<RoleViewDto> roleServiceAll = this.roleService.getAll();
        modelAndView.addObject("roles", roleServiceAll);
        return super.view("/auth-register", modelAndView);
    }

    @PostMapping("/register")
    public ModelAndView postRegister(@ModelAttribute UserRegisterFormDto userRegister) {
        return super.redirect("/auth-login");
    }

    @GetMapping("/login")
    public ModelAndView getLogin() {
        return super.view("/auth-login");
    }


}
