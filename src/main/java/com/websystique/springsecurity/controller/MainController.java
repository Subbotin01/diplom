package com.websystique.springsecurity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.websystique.springsecurity.service.ProductService;
import com.websystique.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET) // задание методам адреса контроллера , по которым они будут доступны на клиенте.
    public ModelAndView homePage(ModelAndView model) {
       model.addObject("usersList",userService.getAll());// вывод интерфейса пользователя
        model.addObject("productList",productService.getAll2());// вывод интерфейса для продукта

        model.setViewName("welcome");

     //System.err.println(userService.getAll().size());

      // System.err.println(productService.getAll2().size());

        return model;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());

        return "admin";
    }

    @RequestMapping(value = "/dUser/{userID}", method = RequestMethod.GET)
    public String dUser(@PathVariable("userID") String userID,ModelMap model) {// получение параметра из адресной строки
        userService.deleteUser(userID);
        return "redirect:/";
    }


    @RequestMapping(value = "/editUser/{userID}", method = RequestMethod.GET)
    public String editUser(@PathVariable("userID") String userID,@PathVariable("pass") String pass,ModelMap model) {
        userService.editeUser(userID,pass);
        return "redirect:/";
    }

    @RequestMapping(value = "/addUser/{userID}/{pass}", method = RequestMethod.GET)
    public String addUser(@PathVariable("userID")String userID,
                          ModelMap model,@PathVariable("pass")String pass) {
        userService.addUser(userID ,pass);
        return "redirect:/";

    }



    @RequestMapping(value = "/dba", method = RequestMethod.GET)
    public String dbaPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "dba";
    }

    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }

    private String getPrincipal(){ // авторизация пользователя
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }


}